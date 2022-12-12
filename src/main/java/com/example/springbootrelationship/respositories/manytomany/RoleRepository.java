package com.example.springbootrelationship.respositories.manytomany;

import com.example.springbootrelationship.entities.manytomany.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
