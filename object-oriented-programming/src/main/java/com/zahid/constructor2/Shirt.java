package com.zahid.constructor2;

public class Shirt {
	private static String color;
	private static char size;
	
	Shirt()
	{
		System.out.println("Inside constructor");
	}
	
	Shirt(String color, char size)
	{
		// this.color = color;
		// this.size = size;
		
		setColor(color);
		setSize(size);
	}
	
	public void putOn() 
	{
		System.out.println("Shirt is on");
	}
	
	public void takeOff()
	{
		System.out.println("Shirt is off");
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setSize(char size)
	{
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public char getSize() {
		return size;
	}
}
