package Module1.AbstractClasses;

public class TestCases {

        public static void main(String[] args) {
            useCase1();
            useCase2();
            useCase3();
            useCase4();
            useCase5();
            useCase6();
            useCase7();
            useCase8();
        }

        // Use Case 1: Basic Abstract Class with Abstract Method
        static void useCase1() {
            abstract class Animal {
                abstract void makeSound();
            }

            class Dog extends Animal {
                void makeSound() {
                    System.out.println("Dog barks");
                }
            }

            Animal a = new Dog();
            a.makeSound();
        }

        // Use Case 2: Abstract Class with Concrete Method
        static void useCase2() {
            abstract class Vehicle {
                void startEngine() {
                    System.out.println("Engine started");
                }

                abstract void drive();
            }

            class Car extends Vehicle {
                void drive() {
                    System.out.println("Car is driving");
                }
            }

            Vehicle v = new Car();
            v.startEngine();
            v.drive();
        }

        // Use Case 3: Abstract Class Cannot Be Instantiated
        static void useCase3() {
            abstract class Shape {
                abstract double area();
            }

            // Uncommenting the below line should cause a compile-time error
            // Shape s = new Shape(); // Error: Cannot instantiate abstract class
            System.out.println("Abstract classes cannot be instantiated directly.");
        }

        // Use Case 4: Abstract Class with Constructor
        static void useCase4() {
            abstract class Appliance {
                Appliance() {
                    System.out.println("Appliance constructor called");
                }

                abstract void turnOn();
            }

            class Fan extends Appliance {
                void turnOn() {
                    System.out.println("Fan turned on");
                }
            }

            Appliance fan = new Fan();
            fan.turnOn();
        }

        // Use Case 5: Abstract Class with Only Concrete Methods
        static void useCase5() {
            abstract class Calculator {
                int add(int a, int b) {
                    return a + b;
                }

                int multiply(int a, int b) {
                    return a * b;
                }
            }

            class BasicCalculator extends Calculator {}

            BasicCalculator calc = new BasicCalculator();
            System.out.println("Sum: " + calc.add(4, 5));
            System.out.println("Product: " + calc.multiply(4, 5));
        }

        // Use Case 6: Abstract Class Implementing Interface
        static void useCase6() {
            interface RunnableTask {
                void run();
            }

            abstract class AbstractRunnable implements RunnableTask {
                void setup() {
                    System.out.println("Setting up...");
                }
            }

            class TaskRunner extends AbstractRunnable {
                public void run() {
                    System.out.println("Running task...");
                }
            }

            TaskRunner task = new TaskRunner();
            task.setup();
            task.run();
        }

        // Use Case 7: Abstract Class with Static Method
        static void useCase7() {
            abstract class Utility {
                static void greet() {
                    System.out.println("Hello from utility!");
                }
            }

            Utility.greet();
        }

        // Use Case 8: Abstract Subclass Not Implementing All Methods
        static void useCase8() {
            abstract class Device {
                abstract void powerOn();
                abstract void powerOff();
            }

            abstract class SmartDevice extends Device {
                void powerOn() {
                    System.out.println("Smart device powered on");
                }
            }

            class SmartPhone extends SmartDevice {
                void powerOff() {
                    System.out.println("Smartphone shutting down");
                }
            }

            Device phone = new SmartPhone();
            phone.powerOn();
            phone.powerOff();
        }
    }
