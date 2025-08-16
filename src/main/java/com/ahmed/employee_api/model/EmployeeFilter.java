package com.ahmed.employee_api.model;

import com.ahmed.employee_api.repository.EmployeeGender;

public class EmployeeFilter {
    private long id;
    private EmployeeGender gender;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EmployeeGender getGender() {
        return gender;
    }

    public void setGender(EmployeeGender gender) {
        this.gender = gender;
    }
}
