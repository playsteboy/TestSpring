package com.example.TestSpring.entities;

public class Room {
    private int number;
    private String description;

    public Room(String description, int number) {
        this.description = description;
        this.number = number;
    }

    public Room() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
