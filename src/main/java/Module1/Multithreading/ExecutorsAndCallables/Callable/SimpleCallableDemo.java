package Module1.Multithreading.ExecutorsAndCallables.Callable;
import java.util.concurrent.Callable;

public class SimpleCallableDemo {

    // Step 1: Create a class that implements Callable
    static class SquareCalculator implements Callable<Integer> {
        private int number;

        // Constructor to receive the number
        public SquareCalculator(int number) {
            this.number = number;
        }

        // Step 2: Override the call() method which returns the result
        @Override
        public Integer call() {
            int result = number * number;
            System.out.println("Calculated square of " + number + " = " + result);
            return result;
        }
    }

    // Main method to run the program
    public static void main(String[] args) throws Exception {
        // Step 3: Create an instance of Callable
        SquareCalculator task = new SquareCalculator(5);

        // Step 4: Directly calling call() like a normal method
        Integer result = task.call();

        // Step 5: Print the returned result
        System.out.println("Returned from call(): " + result);
    }
}
