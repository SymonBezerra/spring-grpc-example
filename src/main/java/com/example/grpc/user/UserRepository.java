package com.example.grpc.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    public Optional<UserEntity> findByUserName(String userName);

}
