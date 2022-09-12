package com.zahid.objectvariable;

public class ObjectTest {
    public static void main(String[] args) {
        DrawingBoard db = new DrawingBoard();
        Circle c = new Circle();
        Square s = new Square();

        db.draw(c);
        db.draw(s);
    }
}
