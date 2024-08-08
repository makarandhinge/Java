package org.example.Demo;



// Main class to test the Employee class
public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 30, 50000);

        // Accessing and modifying the private variables using getter and setter methods
        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();

        // Modifying employee details
        emp.setName("Jane Doe");
        emp.setAge(28);
        emp.setSalary(55000);

        // Displaying modified employee details
        System.out.println("\nModified Employee Details:");
        emp.displayEmployeeDetails();
    }
}

