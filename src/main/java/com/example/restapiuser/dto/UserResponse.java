package com.example.restapiuser.dto;

import com.example.restapiuser.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.catalina.User;

import java.time.LocalDateTime;

// record : getter/setter 없이 dto를 표현 -> 생성자, getter, equals / hashCode, toString 자동 생성
public record UserResponse(
        String userid,
        String username,
        String email,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime indate
) {
    public static UserResponse from(UserEntity userEntity) {
        return new UserResponse(
                userEntity.getUserid(), userEntity.getUsername(),
                userEntity.getEmail(), userEntity.getIndate()
        );
    }
}
