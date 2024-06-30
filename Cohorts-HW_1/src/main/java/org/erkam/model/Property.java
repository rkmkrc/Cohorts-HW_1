package org.erkam.model;

public class Property {
    private double price;
    private double squareMeter;
    private int rooms;
    private int livingRooms;

    public Property(double price, double squareMeter, int rooms, int livingRooms) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public int getRooms() {
        return rooms;
    }

    public int getLivingRooms() {
        return livingRooms;
    }
}


