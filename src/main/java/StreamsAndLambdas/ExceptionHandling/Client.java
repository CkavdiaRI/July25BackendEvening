package StreamsAndLambdas.ExceptionHandling;

public class Client {
    public static void main(String[] args) {
        System.out.println("=== Program Started ===");

        Calculator calculator = new Calculator();

        // ❌ This will throw an unchecked exception (divide by zero)
        try {
            int result = calculator.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // ✅ Safe division
        try {
            int result = calculator.divide(10, 2);
            System.out.println("Safe Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unexpected error!");
        }

        // ❌ Custom checked exception
        try {
            calculator.validateInput(-5);
        } catch (InvalidInputException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        // ❌ File read demo with checked exception
        FileReaderExample fileReader = new FileReaderExample();
        try {
            fileReader.readFile("non_existent_file.txt");
        } catch (Exception e) {
            System.out.println("File error: " + e.getMessage());
        }

        System.out.println("=== Program Ended Gracefully ===");
    }
}
