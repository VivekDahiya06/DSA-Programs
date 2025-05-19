/*
 * Merge Sort Algorithm
 *
 * Description:
 * - Merge Sort is a classic divide-and-conquer sorting algorithm.
 * - It divides the array into two halves, recursively sorts them, and then merges the sorted halves.
 * - It guarantees stable sorting and performs well on large datasets.
 *
 * Characteristics:
 * - Stable sort (preserves the order of equal elements)
 * - Not an in-place algorithm (uses extra memory for merging)
 * - Deterministic performance (no worst-case surprises)
 *
 * Time Complexity:
 * - Best Case: O(n log n)
 * - Worst Case: O(n log n)
 * - Average Case: O(n log n)
 *
 * Space Complexity:
 * - O(n) due to the temporary arrays used during merging
 *
 * Use Cases:
 * - Suitable for sorting linked lists, external sorting (large files)
 * - Reliable when a stable sort is needed
 */

package DSA_Programs.Algorithms.Sorting;
import java.util.Scanner;

public class Merge_Sort {


    /**
     * Recursive method that divides the array into subarrays,
     * sorts them, and merges the sorted subarrays.
     */
    private void sortArray(int[] array, int start, int end) {
        printArray(array);  // Debug print of the current array state

        if (start < end) {
            int mid = start + (end - start) / 2;

            // Recursively sort the left half
            sortArray(array, start, mid);

            // Recursively sort the right half
            sortArray(array, mid + 1, end);

            // Merge the two sorted halves
            mergeArray(array, start, mid, end);
        }
    }


    /**
     * Merges two sorted subarrays into a single sorted array.
     * The first subarray is array[start to mid]
     * The second subarray is array[mid+1 to end]
     */
    private void mergeArray(int[] array, int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        // Create temporary arrays to hold the subarrays
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copy data to temporary arrays
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[start + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays back into an original array
        int i = 0, j = 0, k = start;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[], if any
        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[], if any
        while (j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }


    /**
     * Utility method to print the array.
     */
    private void printArray(int[] array) {
        System.out.print("Array : [ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }


    /**
     * Main method to execute Merge Sort with user input.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements in Array : ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        Merge_Sort merge = new Merge_Sort();

        System.out.println("Before Sorting :");
        merge.printArray(array);
        System.out.println();

        System.out.println("During Sorting :");
        merge.sortArray(array, 0, array.length - 1);
        System.out.println();

        System.out.println("After Sorting :");
        merge.printArray(array);
    }
}
