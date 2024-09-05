package com.abstracaobootcamp.entities;

import java.util.Objects;

public abstract class Content {
    public static final double XP_PADRAO = 10d;

    private String title;
    private String description;

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract double calculateXP();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return Objects.equals(getTitle(), content.getTitle()) && Objects.equals(getDescription(), content.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription());
    }
}
