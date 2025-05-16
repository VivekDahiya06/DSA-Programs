/*
 * Selection Sort Algorithm
 *
 * Description:
 * - Selection Sort divides the array into two parts: the sorted portion at the beginning and the unsorted portion at the end.
 * - It repeatedly selects the smallest (or largest) element from the unsorted part and swaps it with the first element of the unsorted part.
 *
 * Characteristics:
 * - In-place sorting (no extra memory used)
 * - Not a stable sort (relative order of equal elements may change)
 * - Simple to understand and implement
 *
 * Time Complexity:
 * - Best Case: O(n²)
 * - Worst Case: O(n²)
 * - Average Case: O(n²)
 *   (Because it always scans the entire unsorted portion regardless of the current order)
 *
 * Space Complexity:
 * - O(1) -> No additional space is used
 *
 * Use Cases:
 * - Suitable for small datasets or when memory is extremely limited
 * - Useful when the number of swaps is important, as it performs at most (n - 1) swaps
 */
package DSA_Programs.Sorting;
import java.util.Scanner;

public class Selection_Sort {


    private void sort(int[] array) {
        System.out.println("During Sorting :");
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            swapElements(array, i, min);

            printArray(array);
        }
    }


    private void printArray(int[] array) {
        System.out.print("Array: [ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }


    private void swapElements(int[] array, int i, int min) {
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }


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

        Selection_Sort selection = new Selection_Sort();
        System.out.println("Before Sorting :");
        selection.printArray(array);
        System.out.println();

        selection.sort(array);
        System.out.println();

        System.out.println("After Sorting :");
        selection.printArray(array);

    }
}
