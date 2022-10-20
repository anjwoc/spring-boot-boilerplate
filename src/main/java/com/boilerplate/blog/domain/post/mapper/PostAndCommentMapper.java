package com.boilerplate.blog.domain.post.mapper;

import com.boilerplate.blog.domain.post.dto.PostDto;
import com.boilerplate.blog.domain.post.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostAndCommentMapper {
    PostDto toDto(Post post);
}
