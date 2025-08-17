package com.ahmed.employee_api.repository;

import com.ahmed.employee_api.model.Salary;
import com.ahmed.employee_api.model.SalaryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, SalaryId> {
}
