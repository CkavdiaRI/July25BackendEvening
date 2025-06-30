package LabSession_StreamsAndException.Assignment2;

// Checked Exception: Extends Exception
public class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message); // Pass message to superclass
    }
}
