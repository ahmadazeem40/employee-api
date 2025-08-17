package com.ahmed.employee_api.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(schema = "employees", name = "department_employee")
public class DepartmentEmployee {
    @EmbeddedId
    private DepartmentEmployeeId id;
    private LocalDate from_date;
    private LocalDate to_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("employee_id")
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("department_id")
    @JoinColumn(name = "department_id")
    private Department department;

    public DepartmentEmployeeId getId() {
        return id;
    }

    public void setId(DepartmentEmployeeId id) {
        this.id = id;
    }

    public LocalDate getFrom_date() {
        return from_date;
    }

    public void setFrom_date(LocalDate from_date) {
        this.from_date = from_date;
    }

    public LocalDate getTo_date() {
        return to_date;
    }

    public void setTo_date(LocalDate to_date) {
        this.to_date = to_date;
    }
}
