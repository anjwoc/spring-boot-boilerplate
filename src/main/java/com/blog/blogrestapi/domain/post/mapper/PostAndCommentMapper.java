package com.blog.blogrestapi.domain.post.mapper;

import com.blog.blogrestapi.domain.post.dto.PostDto;
import com.blog.blogrestapi.domain.post.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostAndCommentMapper {
    PostDto toDto(Post post);
}
