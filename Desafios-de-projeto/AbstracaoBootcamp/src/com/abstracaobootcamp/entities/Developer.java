package com.abstracaobootcamp.entities;

import java.util.LinkedHashSet;
import java.util.Set;

public class Developer {
    private String fullName;
    private Set<Content> registeredContent;
    private Set<Content> completedContent;

    public Developer(String fullName) {
        this.fullName = fullName;
        this.registeredContent = new LinkedHashSet<>();
        this.completedContent = new LinkedHashSet<>();
    }

    public String getFullName() {
        return fullName;
    }

    public Set<Content> getRegisteredContent() {
        return registeredContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    public void singUpForBootcamp(Bootcamp bootcamp) {
        registeredContent.addAll(bootcamp.getContents());
        bootcamp.addDeveloper(this);
    }

    public void progress(){
        registeredContent.stream()
                .findFirst()
                .ifPresentOrElse(content -> {
                    completedContent.add(content);
                    registeredContent.remove(content);

                }, () -> System.out.println("Você não está matriculado em nenhum conteúdo"));
    }

    public double calculateTotalXP(){
        return completedContent.stream()
                .mapToDouble(Content::calculateXP)
                .sum();
    }
}