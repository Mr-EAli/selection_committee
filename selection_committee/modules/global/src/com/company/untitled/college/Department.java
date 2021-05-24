package com.company.untitled.college;

import com.company.untitled.person.Worker;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "UNTITLED_DEPARTMENT")
@Entity(name = "untitled_Department")
@NamePattern("%s|name")
public class Department extends StandardEntity {
    private static final long serialVersionUID = 3987796015569380903L;

    @Column(name = "CODE")
    private String code;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANAGER_ID")
    private Worker manager;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public Worker getManager() {
        return manager;
    }

    public void setManager(Worker manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}