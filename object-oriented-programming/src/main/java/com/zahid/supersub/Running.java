package com.zahid.supersub;

public class Running extends Shoe {
	private double weight;

	public Running(String brand, double size, double weight) {
		super(brand, size);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
