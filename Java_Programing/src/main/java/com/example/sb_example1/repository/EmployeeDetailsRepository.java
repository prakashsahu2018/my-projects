package com.example.sb_example1.repository;

import com.example.sb_example1.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer> {

//    EmployeeDetails findByEmail(String email);
}
