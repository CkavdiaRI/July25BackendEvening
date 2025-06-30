package Module1.Interface.TestCases;

public class InterfaceTestCases {

    // Use Case 1: Basic Interface Implementation
    // Demonstrates how a class implements a basic interface and overrides its method
    interface Animal {
        void makeSound();
    }

    static class Dog implements Animal {
        public void makeSound() {
            System.out.println("Dog says: Bark");
        }
    }

    // Use Case 2: Multiple Interfaces
    // Demonstrates a class implementing more than one interface
    // Multiple interfaces mean that a single class can implement more than one interface.
    // This allows a class to inherit method signatures from multiple sources and provide its own implementation for all of them.
    // It overcomes the limitation in Java of single inheritance (a class can only extend one class).

    interface Flyable {
        void fly();
    }

    interface Swimmable {
        void swim();
    }

    static class Duck implements Flyable, Swimmable {
        public void fly() {
            System.out.println("Duck flies");
        }

        public void swim() {
            System.out.println("Duck swims");
        }
    }

    // Use Case 3: Default Method in Interface
    // Shows how default methods can provide implementation in interfaces
    interface Logger {
        default void log(String message) {
            System.out.println("Log: " + message);
        }
    }

    static class FileLogger implements Logger {
        // Inherits the default log() method
    }

    static class CustomLogger implements Logger {
        @Override
        public void log(String message) {
            System.out.println("Custom Log: " + message); // Overrides default
        }
    }

    // Use Case 4: Interface Inheritance
    // Demonstrates an interface extending another interface (similar to class inheritance)
    interface Vehicle {
        void start();
    }

    interface Car extends Vehicle {
        void turnOnAC(); // Additional method
    }

    static class Sedan implements Car {
        public void start() {
            System.out.println("Car started");
        }

        public void turnOnAC() {
            System.out.println("AC is on");
        }
    }

    // Use Case 5: Marker Interface
    // An interface with no methods, used for tagging objects (e.g., Serializable, Cloneable)
    // A Marker Interface is an interface with no methods or fields — it’s empty. It is used only to "mark" a class so that the compiler or JVM can treat it differently.
    // Marker Interfaces are used for metadata tagging — no methods required.
    // They are useful when you want to enable special processing without changing the class hierarchy or adding behavior directly.
    interface Serializable {}

    static class Data implements Serializable {} // Marked as serializable

    static class NonSerializableData {} // Not marked

    // Use Case 6: Interface Reference to Concrete Class
    // Demonstrates interface reference holding object and use of downcasting to access extra methods
    interface Shape {
        void draw();
    }

    static class Circle implements Shape {
        public void draw() {
            System.out.println("Drawing Circle");
        }

        public void extraMethod() {
            System.out.println("Circle-specific method");
        }
    }

    // Use Case 7: Type Casting and instanceof with Interface
    // Demonstrates checking and casting to a more specific type, and catching runtime exceptions
    interface Printer {
        void print();
    }

    static class InkjetPrinter implements Printer {
        public void print() {
            System.out.println("Inkjet printing...");
        }

        public void refillInk() {
            System.out.println("Refilling ink...");
        }
    }

    // Run Use Case 1
    public static void useCase1() {
        System.out.println("Basic Implementation:");
        Animal dog = new Dog(); // Interface reference holding implementation
        dog.makeSound(); // Dynamic dispatch
    }

    // Run Use Case 2
    public static void useCase2() {
        Duck duck = new Duck(); // Implements multiple interfaces
        duck.fly();
        duck.swim();
    }

    // Run Use Case 3
    public static void useCase3() {
        Logger logger = new FileLogger(); // Uses default method
        logger.log("Default logger working");

        Logger custom = new CustomLogger(); // Uses overridden method
        custom.log("Overridden logger working");
    }

    // Run Use Case 4
    public static void useCase4() {
        Car car = new Sedan(); // Implements interface inheritance
        car.start();
        car.turnOnAC();

        System.out.println("Parent Interface Reference:");
        Vehicle v = new Sedan();
        v.start();
        // v.turnOnAC(); // Compile error: method not in Vehicle interface
    }

    // Run Use Case 5
    public static void useCase5() {
        Data data = new Data();
        NonSerializableData nonData = new NonSerializableData();

        // Check if object implements marker interface
        System.out.println("Data is Serializable: " + (data instanceof Serializable));
        System.out.println("NonData is Serializable: " + (nonData instanceof Serializable));
    }

    // Run Use Case 6
    public static void useCase6() {
        Shape shape = new Circle(); // Upcasting
        shape.draw();

        System.out.println("Casting Shape to Circle:");
        if (shape instanceof Circle) {
            ((Circle) shape).extraMethod(); // Downcasting to access specific method
        }
    }

    // Run Use Case 7
    public static void useCase7() {
        Printer printer = new InkjetPrinter();
        printer.print();

        if (printer instanceof InkjetPrinter) {
            ((InkjetPrinter) printer).refillInk(); // Safe downcast
        }

        System.out.println("Invalid Cast Test:");
        try {
            // Unsafe cast: runtime error
            Circle notAPrinter = (Circle) printer;
        } catch (ClassCastException e) {
            System.out.println("Caught expected ClassCastException");
        }
    }

    // Entry point
    public static void main(String[] args) {
        System.out.println("Use Case 1:");
        useCase1();

        System.out.println("\nUse Case 2:");
        useCase2();

        System.out.println("\nUse Case 3:");
        useCase3();

        System.out.println("\nUse Case 4:");
        useCase4();

        System.out.println("\nUse Case 5:");
        useCase5();

        System.out.println("\nUse Case 6:");
        useCase6();

        System.out.println("\nUse Case 7:");
        useCase7();
    }
}