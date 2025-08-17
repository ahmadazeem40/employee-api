package com.ahmed.employee_api.model;

import jakarta.persistence.Column;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


public class TitleId implements Serializable {
    @Column(name = "employee_id")
    private Long employee_id;
    @Column(name = "title", length = 50, nullable = false)
    private String title;
    @Column(name = "from_date")
    private LocalDate from_date;

    public TitleId() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getFrom_date() {
        return from_date;
    }

    public void setFrom_date(LocalDate from_date) {
        this.from_date = from_date;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(employee_id, title, from_date);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        TitleId i = (TitleId) o;
        return Objects.equals(employee_id, i.employee_id) && Objects.equals(title, i.title) && Objects.equals(from_date, i.from_date);
    }
}
