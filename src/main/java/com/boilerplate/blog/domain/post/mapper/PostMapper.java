package com.boilerplate.blog.domain.post.mapper;

import com.boilerplate.blog.domain.post.dto.PostDto;
import com.boilerplate.blog.domain.post.Post;
import com.boilerplate.blog.domain.post.dto.CreatePostDto;
import com.boilerplate.blog.domain.post.dto.UpdatePostDto;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface PostMapper {
    @Mapping(target = "comments", ignore = true)
    PostDto toDto(Post post);

    Post toEntity(CreatePostDto createPostData);

    void updateToEntity(UpdatePostDto updatePostData, @MappingTarget Post post);
}
