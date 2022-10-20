package com.boilerplate.blog.domain.post;

import com.boilerplate.blog.common.repository.BaseRepository;

import java.util.Optional;

public interface PostRepository extends BaseRepository<Post, Long> {
    Optional<Post> findByBody(String body);
}
