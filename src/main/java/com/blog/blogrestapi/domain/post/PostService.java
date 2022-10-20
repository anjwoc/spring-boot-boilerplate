package com.blog.blogrestapi.domain.post;

import com.blog.blogrestapi.domain.post.dto.PostDto;
import com.blog.blogrestapi.domain.post.mapper.PostAndCommentMapper;
import com.blog.blogrestapi.domain.post.mapper.PostMapper;
import com.blog.blogrestapi.exception.ResourceNotFoundException;
import com.blog.blogrestapi.common.dto.SuccessResource;
import com.blog.blogrestapi.domain.post.dto.CreatePostDto;
import com.blog.blogrestapi.domain.post.dto.UpdatePostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;
    private final PostAndCommentMapper postAndCommentMapper;

    @Transactional
    public SuccessResource getPosts() {
        List<PostDto> posts = postRepository.findAll()
                .stream()
                .map(postMapper::toDto)
                .collect(Collectors.toList());

        return SuccessResource.builder()
                .data(posts)
                .build();
    }

    public SuccessResource createPost(CreatePostDto createPostData) {
        Post createdPost = postRepository.save(postMapper.toEntity(createPostData));

        return SuccessResource.builder()
                .data(postMapper.toDto(createdPost))
                .build();
    }

    @Transactional
    public SuccessResource getPostById(long id) {
        Optional<Post> postByBody = postRepository.findByBody("블로그 본문 입니다.");
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        return SuccessResource.builder()
                .data(postAndCommentMapper.toDto(post))
                .build();
    }

    @Transactional
    public SuccessResource updatePostById(long id, UpdatePostDto updatePostData) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        postMapper.updateToEntity(updatePostData, post);
        postRepository.save(post);

        return SuccessResource.builder()
                .data(postMapper.toDto(post))
                .build();
    }

    public void deletePostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        postRepository.delete(post);
    }
}
