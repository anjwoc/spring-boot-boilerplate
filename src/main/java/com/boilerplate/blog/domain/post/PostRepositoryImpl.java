package com.boilerplate.blog.domain.post;

import com.boilerplate.blog.common.repository.BaseRepositoryImpl;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import java.util.Optional;

public class PostRepositoryImpl extends BaseRepositoryImpl<Post, Long> implements PostRepository {
    private final QPost post = QPost.post;
    private final JPAQueryFactory query;

    public PostRepositoryImpl(EntityManager em, JPAQueryFactory query) {
        super(Post.class, em);
        this.query = query;
    }

    @Override
    public Optional<Post> findByBody(String body) {
        return Optional.ofNullable(
                query.select(post)
                        .from(post)
                        .where(post.body.eq(body))
                        .fetchFirst()
        );
    }
}
