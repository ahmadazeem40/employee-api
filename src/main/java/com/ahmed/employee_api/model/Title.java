package com.ahmed.employee_api.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@IdClass(TitleId.class)
@Table(schema = "employees", name = "title")
public class Title {

    @Id
    @Column(name = "employee_id")
    private Long employee_id;

    @Id
    @Column(name = "title", length = 50, nullable = false)
    private String title;

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
