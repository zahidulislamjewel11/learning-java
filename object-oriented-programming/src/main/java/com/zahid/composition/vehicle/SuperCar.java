package com.zahid.composition.vehicle;

public class SuperCar extends Car {

    public SuperCar(String carName, String carColor) {
        super(carName, carColor);
    }

    @Override
    public void changeGear() {
        System.out.println(this.carName + " changing gear");
        
    }

}
