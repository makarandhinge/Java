package org.example.PracticesPorgrams.Abstraction;

// Concrete class for Motorcycle
class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year) {
        super(make, model, year);
    }

    // Provide implementation for the abstract method
    @Override
    void start() {
        System.out.println("Motorcycle is starting with a button.");
    }
}