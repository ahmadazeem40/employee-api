package com.ahmed.employee_api.repository;

import com.ahmed.employee_api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // TODO: Add Pagination
    @Query("SELECT e FROM Employee e WHERE e.gender = :gender")
    List<Employee> findEmployeesByGender(EmployeeGender gender);
}
