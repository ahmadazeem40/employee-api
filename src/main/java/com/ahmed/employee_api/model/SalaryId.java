package com.ahmed.employee_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


public class SalaryId implements Serializable {
    @Column(name = "employee_id")
    private Long employee_id;
    @Column(name = "amount")
    private Long amount;
    @Column(name = "from_date")
    private LocalDate from_date;

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

    public SalaryId() {
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(employee_id, amount, from_date);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        SalaryId i = (SalaryId) o;
        return Objects.equals(employee_id, i.employee_id) && Objects.equals(amount, i.amount) && Objects.equals(from_date, i.from_date);
    }
}
