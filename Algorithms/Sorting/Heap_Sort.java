package DSA_Programs.Algorithms.Sorting;
import java.util.Scanner;

public class Heap_Sort {


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

        Heap_Sort heap = new Heap_Sort();
        System.out.println("Before Sorting :");
        heap.printArray(array);
        System.out.println();

        heap.sort(array);
        System.out.println();

        System.out.println("After Sorting :");
        heap.printArray(array);
    }
}
