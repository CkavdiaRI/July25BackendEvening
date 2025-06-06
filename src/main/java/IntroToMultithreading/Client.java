package IntroToMultithreading;

public class Client {
    public static void main(String[] args) {
        // Create a task object
        Runnable task = new HelloWorldPrinter();

        // Pass the task to a new Thread
        Thread thread = new Thread(task);

        // Start the thread (runs task.run() in a new thread)
        thread.start();

        // This runs in the main thread
        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}
