package com.example.springbootrelationship.services.onetomany;

import com.example.springbootrelationship.entities.onetomany.Post;
import com.example.springbootrelationship.respositories.onetomany.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElseThrow(() -> new RuntimeException("Post Not Found!"));
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

}
