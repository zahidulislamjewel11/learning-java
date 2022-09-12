package com.zahid.quadrilateral.rectangle;


public class Rectangle {

    private int width;
    private int height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2*(width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}

    
}
