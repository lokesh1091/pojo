package com.example.pojo.Controller;

import com.example.pojo.Model.Employee;
import com.example.pojo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("getAll")
    public ResponseEntity<List<Employee>> getAll(){
        List<Employee> emplist = employeeRepository.findAll();
        return new ResponseEntity<>(emplist, HttpStatus.OK);
    }

}
