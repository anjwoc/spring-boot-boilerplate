package com.blog.blogrestapi.domain.post;

import com.blog.blogrestapi.common.dto.SuccessResource;
import com.blog.blogrestapi.domain.post.dto.CreatePostDto;
import com.blog.blogrestapi.domain.post.dto.UpdatePostDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public SuccessResource getPosts() {
        return postService.getPosts();
    }

    @PostMapping
    public ResponseEntity<SuccessResource> createPost(@RequestBody CreatePostDto data) {
        return new ResponseEntity<>(postService.createPost(data), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SuccessResource> getPost(@PathVariable long id) {
        return ResponseEntity.ok(postService.getPostById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SuccessResource> updatePost(@PathVariable long id,
                                                   @RequestBody UpdatePostDto data) {
        return new ResponseEntity<>(postService.updatePostById(id, data), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePost(@PathVariable long id) {
        postService.deletePostById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
