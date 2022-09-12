package com.zahid.forest.animal;

public class Bird extends Animal {
    
    private String color;

	public Bird(String gender, int age, String color) {
		super(gender, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    public void fly() {
        String birdName = this.getClass().getSimpleName();
        System.out.println(birdName + " flying");
    }

	@Override
	public String toString() {
		return "Bird [color=" + color + "age=" + this.getAge() + "gender" + this.getGender() +"]";
	}
    
    
}
