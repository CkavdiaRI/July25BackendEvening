package Multithreading.Intro;

public class Client_NumberPrinter {
    public static void main(String[] args) {
        // Create and start 10 threads, each printing a different number
        for (int i = 1; i <= 10; i++) {
            // Pass the number to the task
            Runnable task = new NumberPrinter(i);

            // Create a thread for the task
            Thread thread = new Thread(task);

            // Start the thread
            thread.start();
        }

        System.out.println("Main ends: " + Thread.currentThread().getName());
    }
}
