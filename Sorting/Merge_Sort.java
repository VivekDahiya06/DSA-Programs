package DSA_Programs.Sorting;
import java.util.Scanner;

public class Merge_Sort {


    private void sort(int[] array) {
        System.out.println("During Sorting :");
        System.out.println("sorting...");
    }


    private void printArray(int[] array) {
        System.out.print("Array : [ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
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

        Merge_Sort merge = new Merge_Sort();
        System.out.println("Before Sorting :");
        merge.printArray(array);
        System.out.println();

        merge.sort(array);
        System.out.println();

        System.out.println("After Sorting :");
        merge.printArray(array);
    }
}
