package com.example.spartanewsfeed.comment.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class CommentRequest {
    @NotBlank(message = "댓글 내용은 필수 입력값")
    private String content;
}
