package com.zahid.forest.animal;

public class Animal {

    private String gender;
    private int age;


    public Animal(String gender, int age) {
		this.gender = gender;
		this.age = age;
	}

    
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void eat() {
        String  animalName = this.getClass().getSimpleName();
        System.out.println(animalName + " eating");
    }

	public void sleep() {
        String  animalName = this.getClass().getSimpleName();
        System.out.println(animalName + " eating");
    }


	@Override
	public String toString() {
		return "Animal [age=" + age + ", gender=" + gender + "]";
	}

    
}
