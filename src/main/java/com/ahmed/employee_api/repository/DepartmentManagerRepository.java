package com.ahmed.employee_api.repository;

import com.ahmed.employee_api.model.DepartmentEmployeeId;
import com.ahmed.employee_api.model.DepartmentManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentManagerRepository extends JpaRepository<DepartmentManager, DepartmentEmployeeId> {
}
