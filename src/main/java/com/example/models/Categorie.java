package com.example.models;

public enum Categorie {
    ROMAN("Roman"),
    SCIENCE("Science"),
    HISTOIRE("Histoire");

    private final String libelle;

    Categorie(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
