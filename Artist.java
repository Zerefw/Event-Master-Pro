package com.mycompany.eventemasterpromedellin;

import java.util.ArrayList;
import java.util.List;

public class Artist {
    private int id;
    private String name;
    private String contactInfo;
    private List<String> technicalRequirements;
    private List<String> participationHistory;

    public Artist(int id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.technicalRequirements = new ArrayList<>();
        this.participationHistory = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

    public List<String> getTechnicalRequirements() { return technicalRequirements; }

    public List<String> getParticipationHistory() { return participationHistory; }

    public void addTechnicalRequirement(String requirement) {
        technicalRequirements.add(requirement);
    }

    public void addParticipation(String eventName) {
        participationHistory.add(eventName);
    }

    @Override
    public String toString() {
        return "Artist ID: " + id + ", Name: " + name + ", Contact Info: " + contactInfo +
                ", Technical Requirements: " + technicalRequirements +
                ", Participation History: " + participationHistory;
    }
}
