package org.example.PracticesPorgrams.Abstraction;
// Abstract class
abstract class Vehicle {
    // Common properties
    String make;
    String model;
    int year;

    // Constructor
    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void start();

    // Concrete method
    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

