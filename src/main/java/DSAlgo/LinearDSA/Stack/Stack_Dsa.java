package DSAlgo.LinearDSA.Stack;

import java.util.Scanner;

public class Stack_Dsa {
    static int[] stack = new int[10];
    static Scanner predator = new Scanner(System.in);
    static int top = 0;

    static void push() {
        if (top == stack.length) {
            System.out.println("Stack is OverFlow");
        } else {
            System.out.println(top + " index data enter : ");
            stack[top] = predator.nextInt();
            top++;
        }
    }

    static void pop() {
        if (top-1 < 0) {
            System.out.println("Stack is UnderFlow");
        } else {
            int delete = stack[top-1];
            System.out.println(top-1+ " index element " + delete + " is deleted");
            top--;
        }
    }

    static void monitoring() {
        if (top-1 < 0) {
            System.out.println("The stack is empty");
        } else {
            for (int i = top-1; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
        }
        System.out.println();
    }

    static void stackOperation() {
        int option;
        System.out.println("Welcome to all the stack operation");
        System.out.println("press 0 to close stack operation");
        System.out.println("press 1 to insert element ");
        System.out.println("press 2 to delete element ");
        System.out.println("press 3 to monitoring element");
        do {
            System.out.println("Choose the option ");
            option = predator.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Stack operation is closed");
                    break;
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    monitoring();
                    break;
                default:
                    System.out.println("Something went wrong " + option + " this value could not be happens ");

            }
        } while (option != 0);
    }

    public static void main(String[] args) {
        stackOperation();
    }
}
