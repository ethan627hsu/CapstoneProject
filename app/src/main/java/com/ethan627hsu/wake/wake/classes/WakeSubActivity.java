package com.ethan627hsu.wake.wake.classes;

public class WakeSubActivity {

    private ActivityType type;
    private String name;
    private Object content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public WakeSubActivity() {

    }

    public WakeSubActivity(String name, Object content) {

        this.name = name;
        this.content = content;
    }
}
