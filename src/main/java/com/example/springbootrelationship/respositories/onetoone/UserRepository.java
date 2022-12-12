package com.example.springbootrelationship.respositories.onetoone;

import com.example.springbootrelationship.entities.onetoone.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
