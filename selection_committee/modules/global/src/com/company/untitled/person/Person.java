package com.company.untitled.person;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.validation.constraints.NotNull;
import java.beans.Transient;

@MetaClass(name = "untitled_Person")
@NamePattern("%s|lastName")
public class Person extends BaseUuidEntity {
    private static final long serialVersionUID = 6761737441672156053L;

    @NotNull
    @MetaProperty(mandatory = true)
    private String lastName;

    @NotNull
    @MetaProperty(mandatory = true)
    private String name;

    @MetaProperty
    private String middleName;

    @MetaProperty
    private String dateOfBirthday;

    @MetaProperty
    private String sex;

    public Sex getSex() {
        return sex == null ? null : Sex.fromId(sex);
    }

    public void setSex(Sex sex) {
        this.sex = sex == null ? null : sex.getId();
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Transient
    public String getFIOFull() {
        String result = "";
        result = lastName + " " + name + " ";
        if (middleName != null) result += middleName;
        return result;
    }
}