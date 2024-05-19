package com.example.sb_example1.controller;

import com.example.sb_example1.business.services.EmployeeDetailsService;
import com.example.sb_example1.model.EmployeeDetails;
import com.example.sb_example1.repository.EmployeeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/employee")
public class EmployeeDetailsController {
    @Autowired
    private EmployeeDetailsService employeeDetailsService;

    private final EmployeeDetailsRepository employeeDetailsRepository;

    @Autowired
    public EmployeeDetailsController(EmployeeDetailsRepository employeeDetailsRepository) {
        this.employeeDetailsRepository = employeeDetailsRepository;
    }


    @PostMapping(path="/insert")
    public void insertEmployee(@RequestBody EmployeeDetails emp){

        employeeDetailsService.insertEmployee(emp);


    }

    @GetMapping(path="/get-all")
    public List<EmployeeDetails> getEmployee(){
        return employeeDetailsRepository.findAll();

    }
}
