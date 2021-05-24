package com.company.untitled.person;

import com.company.untitled.college.Department;

import javax.persistence.*;

@Table(name = "UNTITLED_WORKER")
@Entity(name = "untitled_Worker")
public class Worker extends Person {
    private static final long serialVersionUID = -306930872558378050L;

    @Column(name = "POSITION_")
    private String position;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "manager")
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}