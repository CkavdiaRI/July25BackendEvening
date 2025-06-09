package Multithreading.ExecutorsAndCallables.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {

    // Simulates a short task to demonstrate thread reuse
    static class LightweightTask implements Runnable {
        private final int taskId;

        public LightweightTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + " is handled by " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000); // Simulate task duration
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Task " + taskId + " completed by " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ExecutorService cachedService = Executors.newCachedThreadPool();

        // First batch of tasks
        for (int i = 1; i <= 5; i++) {
            cachedService.submit(new LightweightTask(i));
        }

        try {
            // Wait to allow threads to finish and become idle (but not expire)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n--- Submitting second batch of tasks (observe thread reuse below) ---\n");

        // Second batch of tasks — should reuse threads from the first batch
        for (int i = 6; i <= 10; i++) {
            cachedService.submit(new LightweightTask(i));
    }

        // Shutdown executor after task submission
        cachedService.shutdown();
    }
}


//Key Highlights:
//Threads are created dynamically if none are idle.
//Fast, short-lived tasks (email sending) benefit most.
//Threads are reused if they become idle within a short time.
//Always call shutdown() to clean up resources.
//Thread pools increase performance and avoid system overloading caused by excessive thread creation.