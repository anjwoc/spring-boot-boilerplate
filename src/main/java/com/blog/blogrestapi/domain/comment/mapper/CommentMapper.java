package com.blog.blogrestapi.domain.comment.mapper;

import com.blog.blogrestapi.domain.comment.dto.CommentDto;
import com.blog.blogrestapi.domain.comment.Comment;

public class CommentMapper {
    public static CommentDto mapToDto(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setComment(comment.getContent());
        return commentDto;
    }
}
