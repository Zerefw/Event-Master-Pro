package com.mycompany.eventemasterpromedellin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venue {
    private int id;
    private String name;
    private int capacity;
    private List<String> technicalFeatures;
    private List<LocalDate> availableDates;

    public Venue(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.technicalFeatures = new ArrayList<>();
        this.availableDates = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public List<String> getTechnicalFeatures() { return technicalFeatures; }

    public List<LocalDate> getAvailableDates() { return availableDates; }

    public void addTechnicalFeature(String feature) {
        technicalFeatures.add(feature);
    }

    public void addAvailableDate(LocalDate date) {
        availableDates.add(date);
    }

    public boolean isAvailable(LocalDate date) {
        return availableDates.contains(date);
    }

    @Override
    public String toString() {
        return "Venue ID: " + id + ", Name: " + name + ", Capacity: " + capacity +
                ", Technical Features: " + technicalFeatures +
                ", Available Dates: " + availableDates;
    }
}
