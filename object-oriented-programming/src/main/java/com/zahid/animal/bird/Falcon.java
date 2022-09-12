package com.zahid.animal.bird;

public class Falcon implements Bird {

    public Falcon() {
        fly();
    }

	@Override
	public void fly() {
		System.out.println("# Falcon Flying");
		
	}
    
}
