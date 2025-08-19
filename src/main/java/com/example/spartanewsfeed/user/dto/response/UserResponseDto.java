package com.example.spartanewsfeed.user.dto.response;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserResponseDto {

    private final Long id;

    private final String email;

    private final String name;

    private final boolean isPublic;

    private final LocalDateTime createAt;

    private final LocalDateTime modifiedAt;

    public UserResponseDto(Long id, String email, String name, boolean isPublic, LocalDateTime createAt, LocalDateTime modifiedAt){
        this.id = id;
        this.email = email;
        this.name = name;
        this.isPublic = isPublic;
        this.createAt = createAt;
        this.modifiedAt = modifiedAt;
    }

}
