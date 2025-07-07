package Module2.Prototype.PrototypeDP;

// This interface serves as a marker for classes that can be cloned or copied.

public interface Prototype<T> {
    // Method to create a copy of the current object
    T clone();
}
