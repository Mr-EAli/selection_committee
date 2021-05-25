package com.company.untitled.progress;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "UNTITLED_SUBJECT")
@Entity(name = "untitled_Subject")
@NamePattern("%s|name")
public class Subject extends StandardEntity {
    private static final long serialVersionUID = -7575257758408419733L;

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}