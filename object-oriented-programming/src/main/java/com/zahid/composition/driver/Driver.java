package com.zahid.composition.driver;

import com.zahid.composition.vehicle.Car;

public class Driver {
    public Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void drive() {
        System.out.println("Driver is driving " + this.car.carName );
        System.out.println("Color of the car: " + this.car.carColor );
        car.startEngine();
        car.changeGear();
        car.acclerate();
        car.stopEngine();
    }
}
