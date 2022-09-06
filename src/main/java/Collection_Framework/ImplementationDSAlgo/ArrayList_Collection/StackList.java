package Collection_Framework.ImplementationDSAlgo.ArrayList_Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StackList {
    static Scanner predator = new Scanner(System.in);
    static ArrayList<Integer> alist = new ArrayList<Integer>();

    static void push() {
        System.out.println("enter the element : ");
        int data = predator.nextInt();
        alist.add(data);
    }

    static void pop() {
        if (alist.isEmpty()) {
            System.out.println("Stack is UnderFlow");
        } else {
            int delete = alist.remove(alist.size() - 1);
            System.out.println(delete + " element is deleted");
        }
    }

    static void monitoring() {
        if (alist.isEmpty()) {
            System.out.println("THe stack is Empty");
        } else {
            for (Integer i : alist) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        operations();
    }

    static void operations() {
        char option;
        System.out.println("press 'p' to push element into stack");
        System.out.println("press 'd' to delete element into stack");
        System.out.println("press 'm' to display all the stack element  ");
        System.out.println("press 'q' to quite stack operations");
        do {
            System.out.println("\nchoose the option : ");
            option = predator.next().charAt(0);
            switch (option) {
                case 'p':
                    push();
                    break;
                case 'd':
                    pop();
                    break;
                case 'm':
                    monitoring();
                    break;
                case 'q':
                    System.out.println("Stack operation is Closed");
                    break;
                default:
                    System.out.println("Something went wrong " + option + " cannot found ?");
            }
        } while (option != 'q');
    }
}
