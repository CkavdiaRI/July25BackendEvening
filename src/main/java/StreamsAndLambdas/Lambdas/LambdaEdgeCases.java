package StreamsAndLambdas.Lambdas;
import java.util.function.*;

/**
 * A collection of simple lambda examples using only very common or custom interfaces.
 */
public class LambdaEdgeCases {

    // ✅ Custom functional interface with one parameter
    interface Printer {
        void print(String message);
    }

    // ✅ Custom functional interface with two parameters
    interface Calculator {
        int calculate(int a, int b);
    }

    // ✅ Custom functional interface that returns a value
    interface MessageProvider {
        String getMessage();
    }

    public static void edgeCases() {

        // ✅ 1. No parameter lambda (Runnable)
        Runnable task = () -> System.out.println("Running a simple task (Runnable)");
        task.run();

        // ✅ 2. Lambda with single parameter
        Printer helloPrinter = (msg) -> System.out.println("Hello, " + msg);
        helloPrinter.print("Students");

        // ✅ 3. Lambda with multiple parameters
        Calculator adder = (a, b) -> a + b;
        System.out.println("5 + 7 = " + adder.calculate(5, 7));

        // ✅ 4. Lambda with multi-line logic
        Calculator maximum = (a, b) -> {
            if (a > b) return a;
            else return b;
        };
        System.out.println("Max of 10 and 20 is: " + maximum.calculate(10, 20));

        // ✅ Capturing local variables (effectively final)
        int multiplier = 3;
        Calculator multiplierCalc = (x, y) -> (x + y) * multiplier;
        System.out.println("(2 + 3) * 3 = " + multiplierCalc.calculate(2, 3));

    }
}
