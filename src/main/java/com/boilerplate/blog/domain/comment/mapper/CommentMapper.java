package com.boilerplate.blog.domain.comment.mapper;

import com.boilerplate.blog.domain.comment.dto.CommentDto;
import com.boilerplate.blog.domain.comment.Comment;

public class CommentMapper {
    public static CommentDto mapToDto(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setComment(comment.getContent());
        return commentDto;
    }
}
