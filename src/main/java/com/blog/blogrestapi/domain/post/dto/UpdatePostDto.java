package com.blog.blogrestapi.domain.post.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdatePostDto {
    private String title;
    private String body;
}
