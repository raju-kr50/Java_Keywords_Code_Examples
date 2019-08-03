package com.stackroute.oops;

// Jaguar class extends Car class to access its all methods
public class Jaguar extends Car {

    // Private variables declared
    private String price;
    private String color;

    public Jaguar() {
    }

    // Parameterized constructor
    public Jaguar(String price, String color) {
        this.price = price;
        this.color = color;
    }

    // Setters and Getters to set and get properties
    public String  getPrice() {
        return price;
    }

    public void setPrice(String  price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Speed method of Jaguar class. It will be called in Main method
    public void speed() {
        System.out.println("Speed of Jaguar Car is 250 Km/hr");
    }

    // Override methods of Car class
    @Override
    public void start() {
        System.out.println("Jaguar car starts");
    }

    @Override
    public void run() {
        System.out.println("It is running smoothly");
    }

    @Override
    public void stop() {
        System.out.println("The car stops");
    }
}
