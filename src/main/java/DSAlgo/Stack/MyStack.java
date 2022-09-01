package DSAlgo.Stack;
import java.util.Scanner;
public class MyStack {
    static int[] stack=new int[10];
    static Scanner predator=new Scanner(System.in);
    static int top=0;
    public static void push(){
        if(top==stack.length){
            System.out.println("Stack is OverFlow");
        }else {
            System.out.println("enter the element : ");
            int data = predator.nextInt();
            stack[top] = data;
            System.out.println(top + " location element is inserted");
            ++top;
        }
    }
    static void pop(){
        if(top==0){
            System.out.println("Stack is UnderFlow");
        }else {
            int delete = stack[top - 1];
            top--;
        }
    }
    static void Monitoring(){
        if(top==0){
            System.out.println("Stack is Empty");
        }
        else{
            for(int i=top-1;i>=0;i--){
                System.out.print(stack[i]+" ");
            }
        }
    }
    static void StackOperation() {
        System.out.println("Press 'i' to push element into the memory");
        System.out.println("Press 'd' to pop element into the memory");
        System.out.println("Press 'm' to monitoring all the memory element");
        System.out.println("Press 'q' to quite stack operations");
        char option;
        do {
            System.out.println("Enter the option below : ");
            option = predator.next().charAt(0);
            switch (option) {
                case 'i':
                    push();
                    break;
                case 'd':
                    pop();
                    break;
                case 'm':
                    Monitoring();
                    break;
                case 'q':
                    System.out.println("Quit stack System");
                    break;
                default:
                    System.out.println("Something went wrong " + option + " cannot find ? ");
            }
        } while (option != 'q');
    }
    public static void main(String[] args){
        StackOperation();
    }
}
