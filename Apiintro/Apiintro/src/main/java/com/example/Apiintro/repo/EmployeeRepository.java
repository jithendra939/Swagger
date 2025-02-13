package com.example.Apiintro.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Apiintro.entity.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
