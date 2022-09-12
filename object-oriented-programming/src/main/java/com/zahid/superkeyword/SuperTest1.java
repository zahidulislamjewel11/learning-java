package com.zahid.superkeyword;

class Vehicle
{
	int maxSpeed = 120;
	
	public Vehicle()
	{
		System.out.println("Vehicle constructor");
	}
	
	public void showSpeed()
	{
		System.out.println(maxSpeed);
	}
}

class Car extends Vehicle
{
	int maxSpeed = 200;
	
	public Car()
	{
//		System.out.println("Car constructor");
		super();
	}
	
	public void showSpeed()
	{
//		System.out.println(maxSpeed);
//		System.out.println(super.maxSpeed);
		super.showSpeed();
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
		v1.showSpeed();
		
		Car c1 = new Car();
		c1.showSpeed();
	}
}

//# # 'this' and 'super' two reference variable
//# # 'this' refers to the current class
//# # 'super' refers to the parent(super) class
