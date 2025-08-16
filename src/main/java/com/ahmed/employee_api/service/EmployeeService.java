package com.ahmed.employee_api.service;

import com.ahmed.employee_api.model.Employee;
import com.ahmed.employee_api.model.EmployeeFilter;
import com.ahmed.employee_api.repository.EmployeeGender;
import com.ahmed.employee_api.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    private final EmployeeRepository employeeRepository;

    public List<Employee> findEmployeesByGender(EmployeeGender gender){
        return employeeRepository.findEmployeesByGender(gender);
    }
}
