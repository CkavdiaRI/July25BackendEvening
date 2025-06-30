package Module1.Multithreading.ExecutorsAndCallables.Callable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableWithExecutorDemo {

    // Step 1: Create a Callable task that calculates square
    static class SquareCalculator implements Callable<Integer> {
        private int number;

        public SquareCalculator(int number) {
            this.number = number;
        }

        @Override
        public Integer call() {
            int result = number * number;
            System.out.println("Calculating square of " + number);
            return result;
        }
    }

    public static void main(String[] args) throws Exception {
        // Step 2: Create an ExecutorService with one thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Step 3: Create a Callable task
        SquareCalculator task = new SquareCalculator(7);

        // Step 4: Submit the Callable to the executor and get a Future
        Future<Integer> future = executor.submit(task);

        // Step 5: Get the result from the Future
        Integer result = future.get();  // This will wait for the result

        System.out.println("Square is: " + result);

        // Step 6: Shutdown the executor
        executor.shutdown();
    }
}
