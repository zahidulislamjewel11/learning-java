package com.zahid.supersub;

public class Shoe {
	private String brand;
	private double size;
	
	public Shoe(String brand, double size) {
		this.brand = brand;
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
}
