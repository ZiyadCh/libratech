package com.example.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/**
 * Document
 */
@MappedSuperclass
public abstract class Document {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String titre;
  private int annee;
  private boolean disponible = true;

  protected Document() {
  }

  protected Document(String titre, int annee) {
    this.titre = titre;
    this.annee = annee;

  }
  public abstract String getDescription();
}
