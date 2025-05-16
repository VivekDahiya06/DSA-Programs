/*
 * Binary Search Algorithm
 *
 * Description:
 * - Binary Search efficiently searches for a target value in a **sorted** array by repeatedly dividing the search interval in half.
 *
 * Characteristics:
 * - Requires the array to be sorted in ascending or descending order
 * - Significantly faster than linear search for large datasets
 *
 * Time Complexity:
 * - Best Case: O(1)       -> Element found at the middle
 * - Worst Case: O(log n)  -> Repeatedly dividing the search space
 * - Average Case: O(log n)
 *
 * Space Complexity:
 * - Iterative: O(1)
 * - Recursive: O(log n) due to function call stack
 *
 * Use Cases:
 * - Efficient search in large sorted datasets
 * - Used in applications like autocomplete, dictionary lookup, and solving problems via "binary search on answer"
 */
package DSA_Programs.Searching;
import java.util.Scanner;

public class Binary_Search {


    private void search(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                System.out.printf("Element: %d\nIndex: %d", array[mid], mid);
                return;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Element not found");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n = scan.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements in Array :");
        for(int i=0; i<n; i++){
            array[i] = scan.nextInt();
        }

        System.out.println("Enter the target element : ");
        int target = scan.nextInt();
        scan.close();

        Binary_Search binary = new Binary_Search();
        binary.search(array, target);
    }
}
