package DSA_Programs.Data_Structures.Stack;
import java.util.Scanner;
import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        r.close();
        Stack<String> stack1 = new Stack<>();
        String[] A = {"Pen","Pencil","Scale","Sharpner","Eraser"};
        for(int i=0; i<5; i++){
            stack1.push(A[i]);
        }
        System.out.println("\nStack : "+stack1);
        System.out.println(stack1.peek());
    }
}