package com.company.untitled.progress;

import com.company.untitled.Applicants;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "UNTITLED_CERTIFICATE")
@Entity(name = "untitled_Certificate")
public class Certificate extends StandardEntity {
    private static final long serialVersionUID = -344598509886168480L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private String number;

    @Column(name = "SCHOOL")
    private String school;

    @OneToMany(mappedBy = "certificate")
    private List<RatingList> ratingList;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "certificate")
    private Applicants applicants;

    public void setRatingList(List<RatingList> ratingList) {
        this.ratingList = ratingList;
    }

    public List<RatingList> getRatingList() {
        return ratingList;
    }

    public Applicants getApplicants() {
        return applicants;
    }

    public void setApplicants(Applicants applicants) {
        this.applicants = applicants;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}