package com.abstracaobootcamp.entities;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String title;
    private String description;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private Set<Developer> subscribers = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public Bootcamp(String title, String description) {
        this.title = title;
        this.description = description;
        this.startDate = LocalDate.now();
        this.endDate = startDate.plusDays(45);
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Developer> getSubscribers() {
        return Collections.unmodifiableSet(subscribers);
    }

    public Set<Content> getContents() {
        return contents;
    }

    /**/
    public void addDeveloper(Developer developer) {
        subscribers.add(developer);
    }

    public void addContent(Content content) {
        contents.add(content);
    }
}
