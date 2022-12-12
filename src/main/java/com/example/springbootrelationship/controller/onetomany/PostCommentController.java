package com.example.springbootrelationship.controller.onetomany;

import com.example.springbootrelationship.entities.onetomany.Comment;
import com.example.springbootrelationship.entities.onetomany.Post;
import com.example.springbootrelationship.services.onetomany.CommentService;
import com.example.springbootrelationship.services.onetomany.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class PostCommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private PostService postService;

    @GetMapping(path = "/comments")
    public ResponseEntity<List<Comment>> getComments() {
        return ResponseEntity.ok().body(commentService.getAllComments());
    }

    @PostMapping(path = "/comments")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
        return new ResponseEntity<>(commentService.createComment(comment), HttpStatus.CREATED);
    }

    @GetMapping(path = "/posts/{id}")
    public ResponseEntity<Post> getPost(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(postService.getPostById(id));
    }

    @PostMapping(path = "/posts")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        return new ResponseEntity<>(postService.createPost(post), HttpStatus.CREATED);
    }
}
