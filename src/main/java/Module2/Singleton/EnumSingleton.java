package Module2.Singleton;
// Enum Singleton Pattern
// This is a thread-safe singleton implementation using an enum.

public enum EnumSingleton {

    INSTANCE;  // this is the only instance of Singleton

    private int value;

    public void setValue(int val) {
        this.value = val;
    }

    public int getValue() {
        return value;
    }

    public void print() {
        System.out.println("Singleton value is: " + value);
    }

}

class Client5 {

    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        singleton1.setValue(100);
        singleton1.print();

        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        singleton2.print();

        System.out.println("Are both instances same? " + (singleton1 == singleton2)); // true
    }
}

// Pros:
// - Thread-safe by default
// - Simple to implement
// - Reflection safe
// - Serialization safe

// Cons:
// - Cannot pass parameters to the constructor
// - Cannot extend enums, so it may not fit all use cases
// - Module2.Singleton.EnumSingleton is not lazy-loaded, the instance is created when the enum is loaded

