package org.example.PracticesPorgrams;

class MyClass {
    int value;

    // Parameterized constructor
    MyClass(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Compilation error: MyClass() has no default constructor
//        MyClass obj1 = new MyClass(); // Error here

        // Correct usage with parameterized constructor
        MyClass obj2 = new MyClass(10); // This works fine
        System.out.println("Value: " + obj2.value);
    }
}
