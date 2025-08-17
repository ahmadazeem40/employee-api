package com.ahmed.employee_api.repository;

import com.ahmed.employee_api.model.Department;
import com.ahmed.employee_api.model.Employee;
import com.ahmed.employee_api.model.EmployeeGender;
import com.ahmed.employee_api.model.Title;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE e.gender = :gender")
    Page<Employee> findByGender(EmployeeGender gender, Pageable pageable);

    @Query("SELECT de.employee, de.department FROM DepartmentEmployee de WHERE de.department = :department")
    Page<Employee> findByDepartment(Department department, Pageable pageable);

}
