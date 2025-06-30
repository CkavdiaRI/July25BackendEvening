package Module1.Multithreading.LabSession.WebScraper;
import java.util.*;
import java.util.concurrent.*;

// Problem Statement
//You are given a list of 100 dummy URLs (like "http://example.com/page1" to "http://example.com/page100").
//You must:
//Simulate scraping each URL by adding a delay of 200 ms per URL.
//Implement the simulation using:
    // FixedThreadPool of size 10
    // CachedThreadPool
//Measure and print the total execution time taken in each case.


public class WebScraperProblem {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a list of 100 dummy URLs (http://example.com/page1 ... page100)
        List<String> urls = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            urls.add("http://example.com/page" + i);
        }

        // TODO: Call runScraper with newFixedThreadPool
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

        // TODO: Call runScraper with newCachedThreadPool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        runScraper(urls, fixedThreadPool, "Fixed Thread Pool");
        runScraper(urls, cachedThreadPool, "Cached Thread Pool");

    }

    // TODO: Implement this method to time and run all tasks
    private static void runScraper(List<String> urls, ExecutorService executor, String label)
            throws InterruptedException, ExecutionException {

        long start = System.currentTimeMillis();

        // TODO: Create list of Futures
        List<Future<Void>> futures = new ArrayList<>();

        // TODO: Submit ScrapURL tasks to executor
        for (String url : urls) {
            futures.add(executor.submit(new ScrapURL(url)));
        }

        // TODO: Wait for all tasks to finish using future.get()
        for (Future<Void> future : futures) {
            future.get();
        }

        long end = System.currentTimeMillis();

        // TODO: Print time taken with the given label
        System.out.println(label + " - Total time taken: " + (end - start) + " ms");

        // TODO: Shutdown executor
        executor.shutdown();
    }
}
