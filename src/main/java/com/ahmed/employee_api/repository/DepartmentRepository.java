package com.ahmed.employee_api.repository;

import com.ahmed.employee_api.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, String> {
}
