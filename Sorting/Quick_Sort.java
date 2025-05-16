package DSA_Programs.Sorting;
import java.util.Scanner;

public class Quick_Sort {


    private void sort(int[] array) {
        System.out.println("During Sorting :");
        int size = array.length;
        int start = 0;
        int end = size-1;
        int pivot = array[end];
        for(int i=start; i<end; i++){
            if(array[i]<pivot){
                swapElements(array, i, pivot);
            }
        }
    }


    private void printArray(int[] array) {
        System.out.print("Array : [ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }


    private void swapElements(int[] array, int i, int pivot){
        int temp = array[i];
        array[i] = pivot;
        pivot = temp;
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

        Quick_Sort quick = new Quick_Sort();
        System.out.println("Before Sorting :");
        quick.printArray(array);
        System.out.println();

        quick.sort(array);
        System.out.println();

        System.out.println("After Sorting :");
        quick.printArray(array);
    }
}
