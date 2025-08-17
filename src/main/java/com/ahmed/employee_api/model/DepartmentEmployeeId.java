package com.ahmed.employee_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DepartmentEmployeeId implements Serializable {
    @Column(name = "employee_id")
    private Long employee_id;
    @Column(name = "department_id")
    private String department_id;

    public DepartmentEmployeeId() {
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee_id, department_id);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        DepartmentEmployeeId i = (DepartmentEmployeeId) o;
        return Objects.equals(employee_id, i.employee_id) && Objects.equals(department_id, i.department_id);
    }
}
