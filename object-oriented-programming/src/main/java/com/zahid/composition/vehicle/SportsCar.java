package com.zahid.composition.vehicle;

public class SportsCar extends Car {

    public SportsCar(String carName, String carColor) {
        super(carName, carColor);
    }

    @Override
    public void changeGear() {
        System.out.println(this.carName + " changing gear");
        
    }
    
}
