package com.suiwala;

public class Door {
    private int count;
    private int length;
    private int width;

    public Door(int count, int length, int width) {
        this.count = count;
        this.length = length;
        this.width = width;
    }

    public int getCount() {
        return count;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
