package com.egsi.ecoleegsi.dto;

import java.time.LocalDate;
import java.time.Period;

public class MatiereDto{

    private Int id;
    private String name;
    private String teacher;

    public String getId() {
        return id;
    }

    public void setId(Int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
