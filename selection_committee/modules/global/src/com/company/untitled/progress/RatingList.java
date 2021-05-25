package com.company.untitled.progress;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "UNTITLED_RATING_LIST")
@Entity(name = "untitled_RatingList")
public class RatingList extends StandardEntity {
    private static final long serialVersionUID = -4136828596397088571L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUBJECT_ID")
    private Subject subject;

    @Column(name = "RATING")
    private Integer rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CERTIFICATE_ID")
    private Certificate certificate;

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Rating getRating() {
        return rating == null ? null : Rating.fromId(rating);
    }

    public void setRating(Rating rating) {
        this.rating = rating == null ? null : rating.getId();
    }

    public int getIntRating() {
        return rating;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}