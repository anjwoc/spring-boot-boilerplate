package com.boilerplate.blog.domain.comment;

import com.boilerplate.blog.common.repository.BaseRepositoryImpl;
import com.querydsl.jpa.impl.JPAQueryFactory;


import javax.persistence.EntityManager;
import java.util.Optional;

public class CommentRepositoryImpl extends BaseRepositoryImpl<Comment, Long> implements CommentRepository {
    private final QComment comment = QComment.comment;
    private final JPAQueryFactory query;

    public CommentRepositoryImpl(EntityManager em, JPAQueryFactory query) {
        super(Comment.class, em);
        this.query = query;
    }

    @Override
    public Optional<Comment> findByContent(String content) {
        return Optional.ofNullable(
                query.select(comment)
                        .from(comment)
                        .where(comment.content.eq(content))
                        .fetchFirst()
        );
    }
}
