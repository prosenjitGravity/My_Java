package Collection_Framework.ArrayList_Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
    static ArrayList<Integer> al = new ArrayList<Integer>();
    static Scanner predator = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        System.out.println("Stack operation");
        do {
            System.out.println("Choose the option");
            option = predator.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Stack operation quit");
                    break;
                case 1:
                    Insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    monitoring();
                    break;
                default:
                    System.out.println("Something went Wrong");
            }
        } while (option != 0);
    }

    public static void Insert() {
        System.out.println("Enter the data");
        al.add(predator.nextInt());
    }

    public static void delete() {
        if(al.size()-1==-1){
            System.out.println("stack is Underflow");
        }
        al.remove(al.size()-1);
    }

    public static void monitoring() {
        if(al==null){
            System.out.println("stack is Empty");
        }
        for (int i : al) {
            System.out.print(i + " ");
        }
    }
}
