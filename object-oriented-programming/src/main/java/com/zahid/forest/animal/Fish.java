package com.zahid.forest.animal;

public class Fish extends Animal {

	public Fish(String gender, int age) {
		super(gender, age);
	}
    
    public void swim() {
        String fishName = this.getClass().getSimpleName();
        System.out.println(fishName + " swimming");
    }

    @Override
	public String toString() {
		return "Fish [age=" + this.getAge() + "gender" + this.getGender() +"]";
	}
}
