package StreamsAndLambdas.FunctionalInterfaces;

public class Client {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Show usage message
        CalculatorOperations.add.showUsage();

        // Run test cases using different lambdas
        System.out.println("Addition: " + CalculatorOperations.performOperation(a, b, CalculatorOperations.add));
        System.out.println("Subtraction: " + CalculatorOperations.performOperation(a, b, CalculatorOperations.subtract));
        System.out.println("Multiplication: " + CalculatorOperations.performOperation(a, b, CalculatorOperations.multiply));

        // Custom lambda passed directly (on-the-fly)
        Calculator customMod = (x, y) -> x % y;
        System.out.println("Modulus: " + CalculatorOperations.performOperation(a, b, customMod));
    }
}
