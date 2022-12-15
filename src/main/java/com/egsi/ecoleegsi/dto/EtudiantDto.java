package com.egsi.ecoleegsi.dto;

import java.time.LocalDate;
import java.time.Period;

public class EtudiantDto{

    private String mail;
    private String nom;

    private String prenom;

    private LocalDate date_naissance;

    public int calculerAge(){
        return Period.between(date_naissance, LocalDate.now()).getYears();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }
}
