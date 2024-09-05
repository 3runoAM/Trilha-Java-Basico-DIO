package com.abstracaobootcamp.entities;

public class Course extends Content{
    private int creditHours;

    public Course(String title, String description, int creditHours) {
        super(title, description);
        this.creditHours = creditHours;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public String toString(){
        return "Course: [Title: %s, Description: %S Credit Hours: %d]".formatted(this.getTitle(), this.getDescription(), creditHours);
    }

    /**/
    @Override
    public double calculateXP(){
        return XP_PADRAO * creditHours;
    }
}
