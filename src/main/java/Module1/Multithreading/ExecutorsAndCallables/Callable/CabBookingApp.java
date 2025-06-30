package Module1.Multithreading.ExecutorsAndCallables.Callable;
import java.util.concurrent.*;

public class CabBookingApp {

    static class Uber implements Callable<String> {
        public String call() throws Exception {
            System.out.println("Uber task started on " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simulate delay
            } catch (InterruptedException e) {
                System.out.println("Uber task was cancelled!");
                throw e;
            }
            System.out.println("Uber task completed");
            return "Uber booked!";
        }
    }

    static class Ola implements Callable<String> {
        public String call() throws Exception {
            System.out.println("Ola task started on " + Thread.currentThread().getName());
            try {
                Thread.sleep(180); // Simulate delay
            } catch (InterruptedException e) {
                System.out.println("Ola task was cancelled!");
                throw e;
            }
            System.out.println("Ola task completed");
            return "Ola booked!";
        }
    }

    static class Rapido implements Callable<String> {
        public String call() throws Exception {
            System.out.println("Rapido task started on " + Thread.currentThread().getName());
            try {
                Thread.sleep(1200); // Simulate delay
            } catch (InterruptedException e) {
                System.out.println("Rapido task was cancelled!");
                throw e;
            }
            System.out.println("Rapido task completed");
            return "Rapido booked!";
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> uberTask = new Uber();
        Callable<String> olaTask = new Ola();
        Callable<String> rapidoTask = new Rapido();

        java.util.List<Callable<String>> cabTasks = new java.util.ArrayList<>();
        cabTasks.add(uberTask);
        cabTasks.add(olaTask);
        cabTasks.add(rapidoTask);

        System.out.println("Submitting all tasks...\n");

        String result = executor.invokeAny(cabTasks); // Blocks until one completes

        System.out.println("\nResult: " + result);

        executor.shutdown();
    }
}


//invokeAny() takes a list of Callable tasks
//It runs all the tasks in parallel
//It waits only for the fastest one to finish
//As soon as one task returns a result successfully:
    //That result is returned
    //Remaining tasks are cancelled automatically