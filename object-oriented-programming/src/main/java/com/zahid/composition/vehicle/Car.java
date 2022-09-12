package com.zahid.composition.vehicle;

public abstract class Car implements Vehicle {

    public String carName;
    public String carColor;

    public Car(String carName, String carColor) {
        this.carName = carName;
        this.carColor = carColor;
    }

    @Override
    public void acclerate() {
        System.out.println(this.carName + " accelerating");
        
    }
    
    @Override
    public void startEngine() {
        System.out.println(this.carName + " starting engine");
        
    }
    
    @Override
    public void stopEngine() {
        System.out.println(this.carName + " stopping engine");
        
    }

    public abstract void changeGear();

}
