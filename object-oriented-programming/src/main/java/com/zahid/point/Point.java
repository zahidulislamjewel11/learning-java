package com.zahid.point;
public class Point {
    
    public int x;
    public int y;
    private char pointName;

    public static int pointNo = 65;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.pointName = (char)pointNo++;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int x) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return pointName + "(" + this.x + " ," + this.y + ")";
    }

}