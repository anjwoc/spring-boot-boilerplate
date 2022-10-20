package com.boilerplate.blog.domain.comment;

import com.boilerplate.blog.common.repository.BaseRepository;

import java.util.Optional;

public interface CommentRepository extends BaseRepository<Comment, Long> {
    Optional<Comment> findByContent(String Comment);
}
