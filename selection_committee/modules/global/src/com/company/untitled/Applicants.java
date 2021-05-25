package com.company.untitled;

import com.company.untitled.college.Specialty;
import com.company.untitled.person.Person;
import com.company.untitled.progress.Certificate;
import com.company.untitled.progress.IndividualProgress;
import com.company.untitled.progress.RatingList;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "UNTITLED_APPLICANTS")
@Entity(name = "untitled_Applicants")
public class Applicants extends Person {
    private static final long serialVersionUID = -4751713718933142560L;


    @Column(name = "SCHOOL")
    private String school;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SPECIALTY_ID")
    private Specialty specialty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INDIVIDUAL_PROGRESS_ID")
    private IndividualProgress individualProgress;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CERTIFICATE_ID")
    @NotNull
    private Certificate certificate;

    @Column(name = "ENROLLED")
    private Boolean enrolled;

    public Boolean getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(Boolean enrolled) {
        this.enrolled = enrolled;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public IndividualProgress getIndividualProgress() {
        return individualProgress;
    }

    public void setIndividualProgress(IndividualProgress individualProgress) {
        this.individualProgress = individualProgress;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Transient
    public double getAverageScore() {
        List<RatingList> ratingList = certificate.getRatingList();
        int sum = 0;
        for (RatingList rating : ratingList) {
            sum += rating.getIntRating();
        }
        return (double) sum / ratingList.size();
    }
}