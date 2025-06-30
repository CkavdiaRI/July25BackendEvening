package Module1.Multithreading.ExecutorsAndCallables.MultithreadedMergeSort;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortClient {
    public static void main(String[] args) throws Exception {
        // Input array to sort
        int[] inputArray = { 38, 27, 43, 3, 9, 82, 10 };

        // Create a thread pool with a fixed number of threads
        // This thread pool will be reused by all subtasks
        ExecutorService executor = Executors.newCachedThreadPool();
        // ExecutorService executor = Executors.newFixedThreadPool(5);

        try {
            // Create the top-level merge sorter task with the input array
            MergeSorter sorter = new MergeSorter(inputArray, executor);

            // Submit the sorting task to the executor
            Future<int[]> resultFuture = executor.submit(sorter);

            // Get the sorted array once all tasks are done
            int[] sortedArray = resultFuture.get();

            // Print the sorted array
            System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

        } finally {
            // Always shut down the executor after use
            executor.shutdown();
        }
    }
}
