package com.zahid.cuboid;
public class Cuboid {
    private int length;
    private int breadth;
    private int height;

    public Cuboid(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float area()
    {
        return 2*(length*breadth + breadth * height + height*length);
    }

    public float volume()
    {
        return length*breadth*height;
    }
}
