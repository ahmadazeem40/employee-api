package com.ahmed.employee_api.service;

import com.ahmed.employee_api.model.Employee;
import com.ahmed.employee_api.model.EmployeeFilter;
import com.ahmed.employee_api.repository.EmployeeGender;
import com.ahmed.employee_api.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Service
public class EmployeeService {
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    private final EmployeeRepository employeeRepository;

    public Page<Employee> findEmployeesByGender(EmployeeGender gender, int page, int size){
        Pageable pageable = PageRequest.of(page,size);
        return employeeRepository.findEmployeesByGender(gender, pageable);
    }
}
