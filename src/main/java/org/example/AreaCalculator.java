package org.example;

import java.util.ArrayList;
import java.util.List;

// Shape.java
abstract class Shape {
    public abstract double area();
}

// Rectangle.java
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(int i, int i1) {
        super();
    }

    // Constructors, getters, and setters

    @Override
    public double area() {
        return width * height;
    }
}

// Circle.java
class Circle extends Shape {
    private double radius;

    public Circle(int i) {
        super();
    }

    // Constructors, getters, and setters

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// AreaCalculator.java
public class AreaCalculator {
    public double calculateTotalArea(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;
    }
    public static void main(String[] args) {
        // Create a list of shapes
        List<Shape> shapes = new ArrayList<>();

        // Add some rectangles and circles to the list
        shapes.add(new Rectangle(4, 5));  // Width: 4, Height: 5
        shapes.add(new Rectangle(3, 7));  // Width: 3, Height: 7
        shapes.add(new Circle(3));        // Radius: 3
        shapes.add(new Circle(5));        // Radius: 5
        new Rectangle(4,5).area();
        // Create AreaCalculator object and calculate total area
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);

        // Print the total area
        System.out.println("Total Area: " + totalArea);
    }
}
