package Module1.AbstractClasses;

// Abstract class representing a general Vehicle
abstract class Vehicle {
    protected String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void startEngine();

    // Concrete method (already implemented)
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass of Vehicle for Cars
class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " Car engine started with key ignition.");
    }
}

// Subclass of Vehicle for Electric Scooters
class ElectricScooter extends Vehicle {

    ElectricScooter(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " Electric Scooter started silently.");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle("Generic"); ❌ Not allowed – abstract classes can't be instantiated

        Vehicle car = new Car("Toyota");
        Vehicle scooter = new ElectricScooter("Ather");

        // Both subclasses can use base class method
        car.displayBrand();
        car.startEngine();

        System.out.println();

        scooter.displayBrand();
        scooter.startEngine();
    }
}

