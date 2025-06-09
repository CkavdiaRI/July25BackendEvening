package Multithreading.Intro;

public class Client2 {
    public static void main(String[] args) {
        HelloWorldPrinter task = new HelloWorldPrinter();

        // This will run the task in a new thread
        Thread thread = new Thread(task);
        thread.start(); // Executes run() in a separate thread

        // This will run the task in the main thread (NOT multithreading)
        task.run(); // Executes run() in the current (main) thread

        System.out.println("Main thread ends: " + Thread.currentThread().getName());
    }
}