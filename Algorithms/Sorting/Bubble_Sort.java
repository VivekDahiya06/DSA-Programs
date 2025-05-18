/*
 * Bubble Sort Algorithm
 *
 * Description:
 * - Bubble Sort is a simple comparison-based sorting algorithm.
 * - It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
 * - This process is repeated until the array is sorted.
 *
 * Characteristics:
 * - In-place sorting (no extra memory used)
 * - Stable sort (does not change the relative order of equal elements)
 * - Easy to implement but inefficient on large datasets
 *
 * Time Complexity:
 * - Best Case: O(n)        -> When the array is already sorted (with optimization)
 * - Worst Case: O(n²)      -> When the array is sorted in reverse
 * - Average Case: O(n²)
 *
 * Space Complexity:
 * - O(1) -> No additional space used
 *
 * Use Cases:
 * - Useful for educational purposes and small datasets
 * - Not suitable for large datasets due to poor time complexity
 */
package DSA_Programs.Algorithms.Sorting;
import java.util.Scanner;

public class Bubble_Sort {


    private void sort(int[] array){
        System.out.println("During Sorting :");
        int size = array.length;
        for(int i=0; i<size-1; i++){
            for (int j = 0; j < size-1-i; j++) {
                if(array[j] > array[j+1]){
                    swapElements(array, j);
                }
            }
            printArray(array);
        }
    }


    private void printArray(int[] array){
        System.out.print("Array : [ ");
        for(int i: array){
            System.out.print(i+" ");
        }
        System.out.println("]");
    }


    private void swapElements(int[] array, int j){
        int temp = array[j];
        array[j] = array[j+1];
        array[j+1] = temp;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements in Array : ");
        for(int i=0; i<size; i++){
            array[i] = scan.nextInt();
        }
        scan.close();

        Bubble_Sort bubble = new Bubble_Sort();

        System.out.println("Before Sorting :");
        bubble.printArray(array);
        System.out.println();

        bubble.sort(array);
        System.out.println();

        System.out.println("After Sorting :");
        bubble.printArray(array);
    }

}