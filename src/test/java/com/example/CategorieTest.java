package com.example;

import com.example.models.Categorie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategorieTest {
    @Test
    void categoriesExposeTheirLabels() {
        assertEquals("Roman", Categorie.ROMAN.getLibelle());
        assertEquals("Science", Categorie.SCIENCE.getLibelle());
        assertEquals("Histoire", Categorie.HISTOIRE.getLibelle());
    }
}
