package com.zahid.animal.bird;

public class Sparrow implements Bird {

    public Sparrow() {
        fly();
    }

	@Override
	public void fly() {
		System.out.println("# Sparrow Flying");
		
	}
    
}
