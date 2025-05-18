/*
 * Linear Search Algorithm
 *
 * Description:
 * - Linear Search sequentially checks each element of the array until the target element is found or the end is reached.
 *
 * Characteristics:
 * - Works on both sorted and unsorted arrays
 * - Simple to implement, no extra space required
 *
 * Time Complexity:
 * - Best Case: O(1)      -> Element is at the beginning
 * - Worst Case: O(n)     -> Element is at the end or not present
 * - Average Case: O(n)
 *
 * Space Complexity:
 * - O(1) -> No extra space is used
 *
 * Use Cases:
 * - Suitable for small datasets
 * - Useful when Array is unsorted and no indexing mechanism is available
 */

package DSA_Programs.Algorithms.Searching;
import java.util.Scanner;

public class Linear_Search {


    private void search(int[] array, int target){
        for (int i=0; i<array.length; i++) {
            if (array[i] == target) {
                System.out.printf("Element: %d\nIndex: %d",array[i],i);
                return;
            }
        }
        System.out.println("Element not found !!");
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of Array : ");
        int n = scan.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements in Array : ");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.print("Enter the target element : ");
        int target = scan.nextInt();
        scan.close();

        Linear_Search linear = new Linear_Search();
        linear.search(array, target);
    }
}
