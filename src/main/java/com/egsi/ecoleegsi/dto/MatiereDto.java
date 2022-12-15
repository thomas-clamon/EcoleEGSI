package com.egsi.ecoleegsi.dto;

public class MatiereDto {
    private String name;
    private String teacher;

    public String toString(){
        return "Nom de la matière " + name + ". Professeur " + teacher;
    }
}
