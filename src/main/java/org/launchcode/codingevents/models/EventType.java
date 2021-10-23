package org.launchcode.codingevents.models;

public enum EventType {

    CONFERENCE("Conference"),
    MEETUP("Meetup"),
    WORKSHOP("Workshop"),
    SOCIAL("Social");

    private final String displayName;

    private EventType type;

//    Event(String name, String description, String contactEmail, EventType type) {
//        this();
//        this.name = name;
//        this.description = description;
//        this.contactEmail = contactEmail;
//        this.type = type;
//    }

    EventType(String displayName) {
        this.displayName = displayName;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }



    public String getDisplayName() {
        return displayName;
    }

}