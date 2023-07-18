package Competitive_Platform.Java_In_My_Way.Challenge;

import java.util.Scanner;

public class Stack {
    static Scanner predator = new Scanner(System.in);
     static int[]  stack; /*= new int[10]*/;
    static int top = 0;

    public Stack(int n){
        stack=new int[n];
    }
    static void insertion() {
        if (top == stack.length) {
            System.out.println("stack is OverFlow");
        } else {
            System.out.println("enter the element : ");
            stack[top] = predator.nextInt();
            System.out.println(stack[top] + " inserted in " + top + " index");
            top++;
        }
    }

    static void deletion() {
        if (top == 0) {
            System.out.println("Stack is UnderFlow");
        } else {
            int deleted = stack[top - 1];
            System.out.println(deleted + " element is deleted");
            top--;
        }
    }

    static void monitoring() {
        if (top == 0) {
            System.out.println("the Stack is Empty");
        }
        for (int i = top - 1; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }

    static void operation() {
        System.out.println("Welcome to Stack DSA");
        System.out.println("enter 'i' to insert element ");
        System.out.println("enter 'd' to deletion element");
        System.out.println("enter 'm' to Monitoring all element");
        char choice;
        do {
            System.out.println("\nplease choose the option : ");
            choice = predator.next().charAt(0);
            switch (choice) {
                case 'i':
                    insertion();
                    break;
                case 'd':
                    deletion();
                    break;
                case 'm':
                    monitoring();
                    break;
                case 'q':
                    System.out.println("operation quite");
                default:
                    System.out.println("Something went wrong : " + choice + " not match the options");
            }
        } while (choice != 'q');
    }

    public static void main(String[] args) {
        Stack s=new Stack(5);
        operation();
    }
}
