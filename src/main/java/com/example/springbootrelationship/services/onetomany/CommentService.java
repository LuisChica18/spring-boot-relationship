package com.example.springbootrelationship.services.onetomany;

import com.example.springbootrelationship.entities.onetomany.Comment;
import com.example.springbootrelationship.respositories.onetomany.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

}
