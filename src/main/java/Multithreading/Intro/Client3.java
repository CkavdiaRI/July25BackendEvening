package Multithreading.Intro;

// Custom thread names
public class Client3 {
    public static void main(String[] args) {
        // Launch 5 threads with custom names
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new NumberPrinter(i));
            thread.setName("Worker-" + i); // Set thread name for clarity
            thread.start();
        }
    }
}
