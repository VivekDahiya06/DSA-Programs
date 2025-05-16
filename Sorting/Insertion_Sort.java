/*
 * Insertion Sort Algorithm
 *
 * Description:
 * - Insertion Sort is a simple comparison-based sorting algorithm.
 * - It builds the final sorted array one element at a time.
 * - It takes each element and inserts it into its correct position among the already sorted elements.
 *
 * Characteristics:
 * - In-place sorting (no extra memory used)
 * - Stable sort (does not change the relative order of equal elements)
 * - Efficient for small or nearly sorted datasets
 *
 * Time Complexity:
 * - Best Case: O(n)        -> When the array is already sorted
 * - Worst Case: O(n²)      -> When the array is sorted in reverse
 * - Average Case: O(n²)
 *
 * Space Complexity:
 * - O(1) -> No additional space used
 *
 * Use Cases:
 * - Suitable for small datasets
 * - Good for situations where data is nearly sorted
 * - Commonly used in hybrid sorting algorithms (like Timsort)
 */
package DSA_Programs.Sorting;
import java.util.Scanner;

public class Insertion_Sort {


    private void sort(int[] array) {
        System.out.println("During Sorting :");
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int key = array[i];  // Note that Key == j+1 during While loop
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];  // Move to Right if the Previous Element is greater than the current element.
                j--;
            }
            array[j + 1] = key; // Insert the Current element after j-- has occurred & j+1 is now the new j.
            printArray(array);
        }
    }


    private void printArray(int[] array) {
        System.out.print("Array : [ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }


    private void swapElements(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of Array : ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        Insertion_Sort insertion = new Insertion_Sort();
        System.out.println("Before Sorting :");
        insertion.printArray(array);
        System.out.println();

        insertion.sort(array);
        System.out.println();

        System.out.println("After Sorting :");
        insertion.printArray(array);
    }
}
