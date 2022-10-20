package com.blog.blogrestapi.domain.post.dto;

import com.blog.blogrestapi.domain.comment.dto.CommentDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter @Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostDto {
    private Long id;
    private String title;
    private String body;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    private Set<CommentDto> comments;
}
