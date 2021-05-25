package com.company.untitled.progress;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Rating implements EnumClass<Integer> {

    EXCELLENT(5),
    WELL(4),
    SATISFACTORILY(3),
    BAD(2);

    private Integer id;

    Rating(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Rating fromId(Integer id) {
        for (Rating at : Rating.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}