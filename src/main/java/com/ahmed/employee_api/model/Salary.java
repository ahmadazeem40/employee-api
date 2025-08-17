package com.ahmed.employee_api.model;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@IdClass(SalaryId.class)
@Table(schema = "employees", name = "salary")
public class Salary {
    @Id
    @Column(name = "employee_id")
    private Long employee_id;

    @Id
    @Column(name = "amount")
    private Long amount;

    @Id
    @Column(name = "from_date")
    private LocalDate from_date;
    private LocalDate to_date;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
