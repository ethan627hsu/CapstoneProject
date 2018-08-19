package com.ethan627hsu.wake.wake.classes;

public class WakeActivity {

    private ActivityType type;
    private String name;
    private WakeSubActivity subActivity;

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

    public WakeSubActivity getSubActivity() {
        return subActivity;
    }

    public void setSubActivity(WakeSubActivity subActivity) {
        this.subActivity = subActivity;
    }

    public WakeActivity(ActivityType type, String name, WakeSubActivity subActivity) {

        this.type = type;
        this.name = name;
        this.subActivity = subActivity;
    }
}

enum ActivityType {
    SCREEN, VIBRATION, SOUND, ROUTINE
}