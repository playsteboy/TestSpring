package com.example.TestSpring.entities;

import java.time.LocalDate;

public class Booking {
    private int id;
    private Client client;
    private Room room;
    private LocalDate date;
    public Booking(int id, Client client, Room room, LocalDate date) {
        this.id = id;
        this.client = client;
        this.room = room;
        this.date = date;
    }

    public Booking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
