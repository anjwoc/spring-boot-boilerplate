package com.blog.blogrestapi.domain.post.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreatePostDto {
    private String title;
    private String body;
}
