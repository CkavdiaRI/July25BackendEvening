package Module1.Multithreading.ExecutorsAndCallables.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {

    // Use Case: A bank server can process only 5 customers at a time due to limited service counters.

    static class BankTask implements Runnable {
        private final int customerId;

        public BankTask(int customerId) {
            this.customerId = customerId;
        }

        @Override
        public void run() {
            System.out.println("Customer " + customerId + " is being served by: " + Thread.currentThread().getName());
            try {
                // Simulating time taken to process request
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Customer " + customerId + " service completed by: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        // Create a fixed-size thread pool with 5 service counters (threads)
        ExecutorService fixedService = Executors.newFixedThreadPool(5);

        // Simulate 20 customers arriving at the bank
        for (int i = 1; i <= 20; i++) {
            fixedService.submit(new BankTask(i));
        }

        // No more tasks will be submitted; shutdown after current tasks finish
        fixedService.shutdown();
    }
}

//Key Highlights:
//Only 5 threads work concurrently — others wait in queue.
//Simulates a limited-resource scenario (like physical counters).
//Tasks are queued and picked up by idle threads after processing.
//Always call shutdown() to clean up resources.
//Thread pools increase performance and avoid system overloading caused by excessive thread creation.