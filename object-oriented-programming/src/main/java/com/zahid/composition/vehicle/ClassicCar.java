package com.zahid.composition.vehicle;

public class ClassicCar extends Car {

    public ClassicCar(String carName, String carColor) {
        super(carName, carColor);
    }

    @Override
    public void changeGear() {
        System.out.println(this.carName + " changing gear");
        
    }
    
}
