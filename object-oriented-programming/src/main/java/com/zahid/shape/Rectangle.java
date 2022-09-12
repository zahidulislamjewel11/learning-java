package com.zahid.shape;
public class Rectangle implements Shape {
    private int length;
    private int breadth;
    
    public Rectangle() {
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
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

    @Override
    public int getArea() {
        return length * breadth;
    }

    @Override
    public int getPerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public String toString() {
        return "Rectangle [breadth=" + breadth + ", length=" + length + "]";
    }

}
