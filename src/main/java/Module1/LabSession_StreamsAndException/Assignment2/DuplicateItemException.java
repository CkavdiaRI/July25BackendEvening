package Module1.LabSession_StreamsAndException.Assignment2;

// Unchecked Exception: Extends RuntimeException
public class DuplicateItemException extends RuntimeException {
    public DuplicateItemException(String message) {
        super(message);
    }
}