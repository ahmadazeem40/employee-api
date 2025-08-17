package com.ahmed.employee_api.repository;

import com.ahmed.employee_api.model.DepartmentEmployee;
import com.ahmed.employee_api.model.DepartmentEmployeeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentEmployeeRepository extends JpaRepository<DepartmentEmployee, DepartmentEmployeeId> {
}
