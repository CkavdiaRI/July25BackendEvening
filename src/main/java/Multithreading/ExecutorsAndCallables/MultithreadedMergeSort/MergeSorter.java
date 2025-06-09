package Multithreading.ExecutorsAndCallables.MultithreadedMergeSort;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

class MergeSorter implements Callable<int[]> {
    private final int[] array;
    private final ExecutorService executor;

    public MergeSorter(int[] array, ExecutorService executor) {
        this.array = array;
        this.executor = executor;
    }

    @Override
    public int[] call() throws Exception {
        // Get current thread's name
        String threadName = Thread.currentThread().getName();

        // Print the portion of the array being sorted by this thread
        System.out.println(threadName + " - Sorting: " + Arrays.toString(array));

        // Base case: already sorted
        if (array.length <= 1) {
            return array;
        }

        // Divide the array
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Create tasks for left and right subarrays
        MergeSorter leftTask = new MergeSorter(left, executor);
        MergeSorter rightTask = new MergeSorter(right, executor);

        // Submit both tasks to the thread pool
        Future<int[]> leftResult = executor.submit(leftTask);
        Future<int[]> rightResult = executor.submit(rightTask);

        // Wait for both to finish
        int[] sortedLeft = leftResult.get();
        int[] sortedRight = rightResult.get();

        // Merge the results
        int[] merged = merge(sortedLeft, sortedRight);

        // Log merge completion
        System.out.println(threadName + " - Merged:  " + Arrays.toString(merged));

        return merged;
    }

    // Merging two sorted arrays
    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
