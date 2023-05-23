package ru.malkollm.spring_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.malkollm.spring_project.entity.Employee;
import ru.malkollm.spring_project.repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8082/")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> fetchEmployees() {
        return employeeRepository.findAll();
    }
}
