package com.example.sb_example1.business.impl;

import com.example.sb_example1.business.services.EmployeeDetailsService;
import com.example.sb_example1.model.EmployeeDetails;
import com.example.sb_example1.repository.EmployeeDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

    private final EmployeeDetailsRepository employeeDetailsRepository;

    @Autowired
    public EmployeeDetailsServiceImpl(EmployeeDetailsRepository employeeDetailsRepository) {
        this.employeeDetailsRepository = employeeDetailsRepository;
    }

    @Override
    public void insertEmployee(EmployeeDetails employee) {
        // Creating a new EmployeeDetails object
        EmployeeDetails emp = new EmployeeDetails();

        // Setting values from the passed employee object
        emp.setName(employee.getName());
        emp.setEmail(employee.getEmail());
        emp.setStatus("Y");

        // Saving the new EmployeeDetails object
        employeeDetailsRepository.save(emp);
    }
}
