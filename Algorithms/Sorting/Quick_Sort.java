/*
 * Quick Sort Algorithm
 *
 * Description:
 * - Quick Sort is a highly efficient divide-and-conquer sorting algorithm.
 * - It selects a 'pivot' element from the array and partitions the other elements into two subarrays,
 *   according to whether they are less than or greater than the pivot.
 * - The subarrays are then sorted recursively.
 *
 * Characteristics:
 * - In-place sorting (no extra memory used apart from recursion stack)
 * - Not a stable sort (can change the relative order of equal elements)
 * - Very efficient for large datasets
 *
 * Time Complexity:
 * - Best Case: O(n log n)      -> When pivot divides array evenly
 * - Worst Case: O(n²)          -> When pivot is smallest/largest (e.g., already sorted)
 * - Average Case: O(n log n)
 *
 * Space Complexity:
 * - O(log n) on average due to recursion stack
 *
 * Use Cases:
 * - Suitable for large datasets
 * - Commonly used in system libraries and optimized sorting packages
 */
package DSA_Programs.Algorithms.Sorting;
import java.util.Scanner;

public class Quick_Sort {

    /**
     * The main recursive Quick Sort method.
     * It recursively partitions the array around a pivot and sorts each partition.
     */
    private void sort(int[] array, int start, int end) {
        printArray(array);  // Print current state of array during sorting
        if (start < end) {
            int part = partition(array, start, end);  // Get pivot index after partition
            sort(array, start, part - 1);  // Recursively sort left part
            sort(array, part + 1, end);    // Recursively sort right part
        }
    }

    /**
     * Partition method (Lomuto partition scheme):
     * - Chooses the last element as pivot.
     * - Rearranges elements so that all elements <= pivot come before it,
     *   and all > pivot elements come after it.
     * - Places pivot in its correct sorted position.
     */
    private int partition(int[] array, int start, int end) {
        int i = start - 1;            // Index of smaller element
        int pivot = array[end];      // Pivot element

        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                swapElements(array, i, j);  // Swap if element is <= pivot
            }
        }

        swapElements(array, i + 1, end);  // Place pivot in correct position
        return i + 1;                     // Return index of pivot
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
     * Utility method to swap two elements in the array.
     */
    private void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Main method to execute Quick Sort with user input.
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

        Quick_Sort quick = new Quick_Sort();
        System.out.println("Before Sorting :");
        quick.printArray(array);
        System.out.println();

        System.out.println("During Sorting :");
        quick.sort(array, 0, array.length - 1);
        System.out.println();

        System.out.println("After Sorting :");
        quick.printArray(array);
    }
}
