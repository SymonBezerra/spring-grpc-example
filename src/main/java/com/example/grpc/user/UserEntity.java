package com.example.grpc.user;

import com.example.grpc.services.user.UserProto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserEntity {
    @Id
    @Column(nullable = false, unique = true, length = 36)
    private String id;

    @Column(name = "username")
    private String userName;

    public UserEntity(UserProto.User user) {
        this.id = user.getId();
        this.userName = user.getUserName();
    }

    public UserProto.User toProto() {
        return UserProto.User.newBuilder()
            .setId(id)
            .setUserName(userName)
            .build();
    }
}