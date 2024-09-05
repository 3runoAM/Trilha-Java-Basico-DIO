package com.abstracaobootcamp.entities;

import java.time.LocalDate;

public class Mentorship extends Content {
    private LocalDate date;

    public Mentorship(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    };

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String toString(){
        return "Mentorship: [Title: %s, Description: %s, Date: %s]".formatted(this.getTitle(), this.getDescription(), this.getDate());
    }



    /**/

    @Override
    public double calculateXP(){
        return XP_PADRAO + 20d;
    }
}
