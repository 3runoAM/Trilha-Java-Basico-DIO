package com.abstracaobootcamp.entities;

public class Curso {
    private String title;
    private String description;
    private int creditHours;

    public Curso(String title, String description, int creditHours) {
        this.title = title;
        this.description = description;
        this.creditHours = creditHours;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCreditHours() {
        return creditHours;
    }
}
