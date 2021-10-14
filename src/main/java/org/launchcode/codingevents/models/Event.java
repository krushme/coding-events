package org.launchcode.codingevents.models;

public class Event {

    private String name;

    public Event(String name) {
        this.name = name;
    }

    //overrides
    @Override
    public String toString() {
        return name;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
