package com.example.springbootrelationship.respositories.onetomany;

import com.example.springbootrelationship.entities.onetomany.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
