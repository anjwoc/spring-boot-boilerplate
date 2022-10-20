package com.blog.blogrestapi.domain.comment.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CommentDto {
    private Long id;
    private String comment;
}
