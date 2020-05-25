package com.example.demo.topic;

public class Topic {

    private String id;
    private String name;
    private String description;


    public Topic() { }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;

        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
