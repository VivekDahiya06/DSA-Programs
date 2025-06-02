package DSA_Programs.Data_Structures.Stack;
import java.util.Scanner;

public class Stacks<T> {
    int top = -1;
    T[] array;

    Stacks(int size){
        this.array = (T[])new Object[size];
    }

    private void push(T item){
        top++;
        array[top] = item;
    }


    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        r.close();
        Stacks<String> stack1 = new Stacks<>(10);
        String[] A = {"Pen","Pencil","Scale","Sharpner","Eraser"};

    }
}