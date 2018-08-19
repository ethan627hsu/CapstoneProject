package com.ethan627hsu.wake.wake.classes;

public class WakeActivity {

    private ActivityType type;
    private String name;

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WakeActivity() {

    }

    public WakeActivity(ActivityType type, String name) {

        this.type = type;
        this.name = name;
    }
}

enum ActivityType {
    SCREEN, VIBRATION, SOUND, ROUTINE
}