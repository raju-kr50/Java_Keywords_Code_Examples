package com.stackroute.oops;

// Car class implememts Vehicle interface to override its methods
public class Car implements Vehicle {

    // Override methods
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }
}
