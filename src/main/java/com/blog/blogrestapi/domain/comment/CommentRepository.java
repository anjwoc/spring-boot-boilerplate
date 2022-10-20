package com.blog.blogrestapi.domain.comment;

import com.blog.blogrestapi.common.repository.BaseRepository;

import java.util.Optional;

public interface CommentRepository extends BaseRepository<Comment, Long> {
    Optional<Comment> findByContent(String Comment);
}
