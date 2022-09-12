package com.zahid.instanceofkeyword;

class Car
{
	int speed;
}

public class InstanceTest {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c instanceof Car);
	}
}

