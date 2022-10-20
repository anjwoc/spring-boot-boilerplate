package com.blog.blogrestapi.domain.post.mapper;

import com.blog.blogrestapi.domain.post.dto.PostDto;
import com.blog.blogrestapi.domain.post.Post;
import com.blog.blogrestapi.domain.post.dto.CreatePostDto;
import com.blog.blogrestapi.domain.post.dto.UpdatePostDto;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface PostMapper {
    @Mapping(target = "comments", ignore = true)
    PostDto toDto(Post post);

    Post toEntity(CreatePostDto createPostData);

    void updateToEntity(UpdatePostDto updatePostData, @MappingTarget Post post);
}
