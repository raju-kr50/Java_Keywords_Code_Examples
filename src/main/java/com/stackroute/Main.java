package com.stackroute;

import com.stackroute.oops.Car;
import com.stackroute.oops.Jaguar;
import com.stackroute.oops.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Car object to access Car class methods
        Car car = new Car();
        car.run();
        car.start();
        car.stop();
        System.out.println("*********************************************************");

        // Jaguar object to access methods of Jaguar class
       Jaguar jaguar= new Jaguar();
        jaguar.start();
        jaguar.run();
        jaguar.speed();
        jaguar.stop();
    }
}