package com.company.untitled.progress;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "UNTITLED_INDIVIDUAL_PROGRESS")
@Entity(name = "untitled_IndividualProgress")
@NamePattern("%s|name")
public class IndividualProgress extends StandardEntity {
    private static final long serialVersionUID = 7169153642761909553L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "POINT_NUM")
    private String pointNum;

    public String getPointNum() {
        return pointNum;
    }

    public void setPointNum(String pointNum) {
        this.pointNum = pointNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}