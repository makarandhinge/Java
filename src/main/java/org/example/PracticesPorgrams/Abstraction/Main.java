package org.example.PracticesPorgrams.Abstraction;

public class Main {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Vehicle myCar = new Car("Toyota", "Corolla", 2020);
        Vehicle myMotorcycle = new Motorcycle("Honda", "CBR", 2022);

        // Display information
        myCar.displayInfo();
        myMotorcycle.displayInfo();

        // Start vehicles
        myCar.start();
        myMotorcycle.start();
    }
}
