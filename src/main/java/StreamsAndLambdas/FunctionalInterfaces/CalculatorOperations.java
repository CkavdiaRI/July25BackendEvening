package StreamsAndLambdas.FunctionalInterfaces;

public class CalculatorOperations {


    // Method to execute operation
    public static int performOperation(int a, int b, Calculator calculator) {
        return calculator.operation(a, b);
    }

    // Reusable lambdas (students can see how behavior is modularized)
    public static final Calculator add = (x, y) -> x + y;
    public static final Calculator subtract = (x, y) -> x - y;
    public static final Calculator multiply = (x, y) -> x * y;

    // Optional: Custom operation
    public static final Calculator max = (x, y) -> Math.max(x, y);
}
