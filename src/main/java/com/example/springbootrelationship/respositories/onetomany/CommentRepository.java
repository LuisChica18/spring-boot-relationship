package com.example.springbootrelationship.respositories.onetomany;

import com.example.springbootrelationship.entities.onetomany.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
