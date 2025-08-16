package com.ahmed.employee_api.repository;

import com.ahmed.employee_api.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // TODO: Add Pagination
    @Query("SELECT e FROM Employee e WHERE e.gender = :gender")
    Page<Employee> findEmployeesByGender(EmployeeGender gender, Pageable pageable);
}
