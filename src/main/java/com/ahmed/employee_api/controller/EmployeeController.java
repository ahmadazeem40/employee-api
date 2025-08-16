package com.ahmed.employee_api.controller;

import com.ahmed.employee_api.model.Employee;
import com.ahmed.employee_api.model.EmployeeFilter;
import com.ahmed.employee_api.repository.EmployeeGender;
import com.ahmed.employee_api.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/gender")
    public List<Employee> getEmployeeByGender(@RequestBody EmployeeFilter filter){
        return employeeService.findEmployeesByGender(filter.getGender());
    }
}
