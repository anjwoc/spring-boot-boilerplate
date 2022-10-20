package com.blog.blogrestapi.domain.post;

import com.blog.blogrestapi.common.repository.BaseRepository;

import java.util.Optional;

public interface PostRepository extends BaseRepository<Post, Long> {
    Optional<Post> findByBody(String body);


}
