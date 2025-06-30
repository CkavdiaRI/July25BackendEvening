package Module1.StreamsAndLambdas.ExceptionHandling;

public class Calculator {

    // Demonstrates an unchecked exception (division by zero)
    public int divide(int a, int b) {
        // No need to declare unchecked exceptions in method signature
        return a / b;
    }

    // Demonstrates a custom checked exception
    public void validateInput(int value) throws InvalidInputException {
        if (value < 0) {
            throw new InvalidInputException("Input must be non-negative.");
        }
        System.out.println("Input is valid: " + value);
    }
}
