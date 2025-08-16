package com.ahmed.employee_api.model;

import com.ahmed.employee_api.repository.EmployeeGender;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(schema = "employees", name = "employee")
public class Employee {
    @Id
    private Long id;

    private LocalDate birth_date;

    private String first_name;

    private String last_name;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private EmployeeGender gender;

    private LocalDate hire_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public EmployeeGender getGender() {
        return gender;
    }

    public void setGender(EmployeeGender gender) {
        this.gender = gender;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }
}
