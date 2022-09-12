package com.zahid.objectvariable;
public class DrawingBoard {

    public void draw(Shape shape)
    {
        System.out.println("Drawing a shape: "+shape.getName());
        String typeName = shape.getClass().getTypeName();
        String superClassType = shape.getClass().getSuperclass().getTypeName();
        System.out.println("TypeName: "+typeName);
        System.out.println("SuperCLass Type: "+superClassType);
        System.out.println();
    }
}

