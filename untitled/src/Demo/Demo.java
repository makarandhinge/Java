package Demo;

public class Demo {
    static int staticVar = 0;
    int instanceVar = 0;

    public static void staticMethod() {
        staticVar++;
    }

    public void nonStaticMethod() {
        instanceVar++;
    }

    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        // Accessing static method
        Demo.staticMethod();

        // Accessing non-static method
        obj1.nonStaticMethod();
        obj2.nonStaticMethod();

        System.out.println("Static variable: " + Demo.staticVar); // Output: 1
        System.out.println("Instance variable of obj1: " + obj1.instanceVar); // Output: 1
        System.out.println("Instance variable of obj2: " + obj2.instanceVar); // Output: 1
    }
}
