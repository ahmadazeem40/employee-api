package com.ahmed.employee_api.controller;

import com.ahmed.employee_api.model.Employee;
import com.ahmed.employee_api.model.EmployeeFilter;
import com.ahmed.employee_api.model.Salary;
import com.ahmed.employee_api.model.Title;
import com.ahmed.employee_api.service.EmployeeService;
import org.springframework.data.domain.Page;
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
        Page<Employee> employeePage = employeeService.findEmployeesByGender(filter.getGender(), filter.getPage(), filter.getSize());
        return employeePage.getContent();
    }

    @GetMapping("/title")
    public List<Title> getEmployeesTitle(@RequestBody EmployeeFilter filter){
        Page<Title> titlePage = employeeService.findAllTitles(filter.getPage(), filter.getSize());
        return titlePage.getContent();
    }

    @GetMapping("/salary")
    public List<Salary> getEmployeesSalaries(@RequestBody EmployeeFilter filter){
        Page<Salary> salaryPage = employeeService.findAllSalaries(filter.getPage(), filter.getSize());
        return salaryPage.getContent();
    }

    @GetMapping("/department")
    public List<Employee> getEmployeesByDepartment(@RequestBody EmployeeFilter filter){
        Page<Employee> employeePage = employeeService.findEmployeesByDepartment(filter.getDepartment_id(), filter.getPage(), filter.getSize());
        return employeePage.getContent();
    }
}
