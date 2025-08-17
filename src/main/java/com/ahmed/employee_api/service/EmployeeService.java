package com.ahmed.employee_api.service;

import com.ahmed.employee_api.model.*;
import com.ahmed.employee_api.repository.DepartmentRepository;
import com.ahmed.employee_api.repository.EmployeeRepository;
import com.ahmed.employee_api.repository.SalaryRepository;
import com.ahmed.employee_api.repository.TitleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final TitleRepository titleRepository;
    private final SalaryRepository salaryRepository;

    public EmployeeService(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository, TitleRepository titleRepository, SalaryRepository salaryRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
        this.titleRepository = titleRepository;
        this.salaryRepository = salaryRepository;
    }

    public Page<Employee> findEmployeesByGender(EmployeeGender gender, int page, int size){
        Pageable pageable = PageRequest.of(page,size);
        return employeeRepository.findByGender(gender, pageable);
    }

    public Page<Employee> findEmployeesByDepartment(String department_id, int page, int size){
        Optional<Department> departmentOptional = departmentRepository.findById(department_id);
        Pageable pageable = PageRequest.of(page, size);

        if(departmentOptional.isPresent()){
            Department department = departmentOptional.get();
            return employeeRepository.findByDepartment(department, pageable);
        }
        else{
            return Page.empty();
        }

    }
    public Page<Title> findAllTitles(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        return titleRepository.findAll(pageable);
    }

    public Page<Salary> findAllSalaries(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        return salaryRepository.findAll(pageable);
    }
}
