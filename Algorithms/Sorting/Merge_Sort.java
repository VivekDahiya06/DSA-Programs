package DSA_Programs.Algorithms.Sorting;
import java.util.Scanner;

public class Merge_Sort {


    private void sortArray(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start+end)/2;
            sortArray(array,start, mid);
            sortArray(array,mid+1,end);
            mergeArray(array);
        }
    }

    private void mergeArray(int[] array){

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

        merge.sortArray(array,0,array.length-1);
        System.out.println();

        System.out.println("After Sorting :");
        merge.printArray(array);
    }
}
