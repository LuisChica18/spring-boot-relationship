package com.example.springbootrelationship.respositories.manytomany;

import com.example.springbootrelationship.entities.manytomany.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
