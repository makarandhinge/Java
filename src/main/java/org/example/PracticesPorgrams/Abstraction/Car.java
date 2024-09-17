package org.example.PracticesPorgrams.Abstraction;

// Concrete class for Car
class Car extends Vehicle {
    Car(String make, String model, int year) {
        super(make, model, year);
    }

    // Provide implementation for the abstract method
    @Override
    void start() {
        System.out.println("Car is starting with a key.");
    }
}

