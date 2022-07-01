package com.example.producto2.entity;

public class Message {
    private int id;
    private int digitalId;
    private String title;
    private String description;

    public int getId() {
        return id;
    }

    public int getDigitalId() {
        return digitalId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", digitalId=" + digitalId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
