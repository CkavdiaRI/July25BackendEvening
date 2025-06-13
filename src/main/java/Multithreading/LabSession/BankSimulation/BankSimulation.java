package Multithreading.LabSession.BankSimulation;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BankSimulation {

    public static void main(String[] args) throws InterruptedException {
        BankAccountSol1 bankAccount = new BankAccountSol1();

        Runnable depositTask = () -> {
            for (long i = 1; i <= 1000; i++) {
                bankAccount.deposit(i);
            }
        };

        Runnable withdrawTask = () -> {
            for (long i = 1; i <= 1000; i++) {
                bankAccount.withdraw(i);
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(4);

        long start = System.currentTimeMillis();

        es.execute(depositTask);
        es.execute(depositTask);
        es.execute(withdrawTask);
        es.execute(withdrawTask);

        es.shutdown();
        es.awaitTermination(5, TimeUnit.SECONDS);

        long end = System.currentTimeMillis();

        System.out.println("Final Balance: " + bankAccount.getBalance());
        System.out.println("Time Taken: " + (end - start) + " ms");
    }
}

