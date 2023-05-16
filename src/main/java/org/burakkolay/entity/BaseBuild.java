package org.burakkolay.entity;

public abstract class BaseBuild {
    private int price;
    private int size;
    private int saloon;
    private int room;

    public BaseBuild(int price, int size, int saloon, int room) {
        this.price = price;
        this.size = size;
        this.saloon = saloon;
        this.room = room;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public int getSaloon() {
        return saloon;
    }

    public int getRoom() {
        return room;
    }
}
