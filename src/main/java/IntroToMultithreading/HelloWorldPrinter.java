package IntroToMultithreading;

// A simple class that implements Runnable to define a task
public class HelloWorldPrinter implements Runnable {

    public void print(){
        System.out.println("Hello from thread: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        print();
    }
}