package org.example;

public class Event {
    private String name;
    private String description;

    public Event(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Event name cannot be null");
        }
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
}

