package com.company.untitled.web.screens.subject;

import com.company.untitled.Applicants;
import com.company.untitled.progress.RatingList;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.progress.Subject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@UiController("untitled_Subject.edit")
@UiDescriptor("subject-edit.xml")
@EditedEntityContainer("subjectDc")
@LoadDataBeforeShow
public class SubjectEdit extends StandardEditor<Subject> {
    @Table(name = "UNTITLED_CERTIFICATE")
    @Entity(name = "untitled_Certificate")
    public static class Certificate extends StandardEntity {
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
}