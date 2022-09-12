package com.zahid.composition;

import com.zahid.composition.vehicle.Car;
import com.zahid.composition.vehicle.ClassicCar;
import com.zahid.composition.vehicle.SportsCar;
import com.zahid.composition.vehicle.SuperCar;
import com.zahid.composition.driver.Driver;

public class DrivingTest {
    public static void main(String[] args) {
        
        SuperCar bmw101 = new SuperCar("BMW", "Black");
        Driver driver1 = new Driver(bmw101);
        driver1.drive();

        System.out.println();

        SportsCar mazda101 = new SportsCar("Mazda", "Yellow");
        Driver driver2 = new Driver(mazda101);
        driver2.drive();

        System.out.println();

        Car toyota101 = new ClassicCar("Toyota", "White");
        Driver driver3 = new Driver(toyota101);
        driver3.drive();

        System.out.println();

    }
}
