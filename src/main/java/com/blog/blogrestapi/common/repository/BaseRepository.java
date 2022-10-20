package com.blog.blogrestapi.common.repository;

import com.blog.blogrestapi.domain.comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID> {

}
