package com.example.grpc.user;

import com.example.grpc.services.user.UserProto;
import com.example.grpc.services.user.UsersServiceGrpc;
import com.google.protobuf.Empty;
import com.google.protobuf.StringValue;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserService extends UsersServiceGrpc.UsersServiceImplBase {

    @Autowired
    UserRepository repository;

    @Override
    public void findById(StringValue request,
        StreamObserver<UserProto.User> responseObserver) {
        String message = request.getValue();
        System.out.println("Message: " + message);
        Optional<UserEntity> user = repository.findById(message);
        if (user.isPresent())
        {
            UserProto.User u = user.get().toProto();
            responseObserver.onNext(u);
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(Status.NOT_FOUND
            .withDescription("ID not found")
            .asRuntimeException());
        }
    }

    @Override
    public void findByUserName(StringValue request,
    StreamObserver<UserProto.User> responseObserver) {
        String message = request.getValue();
        Optional<UserEntity> user = repository.findByUserName(message);
        if (user.isPresent())
        {
            UserProto.User u = user.get().toProto();
            responseObserver.onNext(u);
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(Status.NOT_FOUND
            .withDescription("Username not found")
            .asRuntimeException());
        }
    }

    @Override
    public void findAll(Empty request,
        StreamObserver<UserProto.Users> responseObserver) {

        List<UserProto.User> users = repository.findAll()
        .stream().map(UserEntity::toProto)
        .collect(Collectors.toList());

        UserProto.Users u = UserProto.Users.newBuilder().addAllUsers(users).build();

        responseObserver.onNext(u);
        responseObserver.onCompleted();
    }

    @Override
    public void addUser(UserProto.User request,
        StreamObserver<UserProto.User> responseObserver) {

        UserEntity entity = new UserEntity(request);
        entity.setId(UUID.randomUUID().toString());
        if(repository.findByUserName(entity.getUserName()).isPresent())
        {
            responseObserver.onError(Status.ALREADY_EXISTS
            .withDescription("Username already taken")
            .asRuntimeException());
        }
        repository.save(entity);
        UserProto.User u = entity.toProto();
        responseObserver.onNext(u);
        responseObserver.onCompleted();
    }

    @Override
    public void updateUserName(UserProto.UpdateUserNameDTO request,
        StreamObserver<Empty> responseObserver) {
        Optional<UserEntity> targetUser = repository.findById(request.getId());
        if (targetUser.isPresent()) {
            UserEntity userToUpdate = targetUser.get();
            userToUpdate.setUserName(request.getUserName());
            if(repository
            .findByUserName(userToUpdate.getUserName()).isPresent()) {
                responseObserver.onError(Status.ALREADY_EXISTS
                .withDescription("Username already taken")
                .asRuntimeException());
            }
            repository.save(userToUpdate);
            responseObserver.onNext(Empty.getDefaultInstance());
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(Status.NOT_FOUND
            .withDescription("ID Not Found")
            .asRuntimeException());
        }
    }

    @Override
    public void deleteUser(StringValue request,
        StreamObserver<Empty> responseObserver) {
        String id = request.getValue();
        Optional<UserEntity> targetEntity = repository.findById(id);
        if(!targetEntity.isPresent()) {
            responseObserver.onError(Status.NOT_FOUND
            .withDescription("ID not found")
            .asRuntimeException());
            return;
        }
        repository.delete(targetEntity.get());
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
