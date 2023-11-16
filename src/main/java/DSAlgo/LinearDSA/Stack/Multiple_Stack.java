package DSAlgo.LinearDSA.Stack;

import java.util.Scanner;

public class Multiple_Stack {
    static int m_stack[]=new int[20];
    static int left_top=0;
    static Scanner predator=new Scanner(System.in);
    static int right_top=m_stack.length-1;
    static void push_left_stack(){
        if(left_top==m_stack.length){
            System.out.println("the left stack is OverFlow");
        }else{
            System.out.println(left_top+" index enter element : ");
            m_stack[left_top]=predator.nextInt();
//            System.out.println("element"++" is ")
            left_top++;
        }
    }
    static void push_right_stack(){
        if(right_top==left_top){
            System.out.println("the right stack is Overflow");
        }else{
            System.out.println(right_top+" index enter element : ");
            m_stack[right_top]=predator.nextInt();
//            System.out.println("element"++" is ")
            right_top--;
        }
    }
    static void monitoring_left_stack(){
        if(left_top-1<0){
            System.out.println("the left stack is empty");
        }else{
            for(int i=left_top-1;i>=0;i--){
                System.out.print(m_stack[i]+" ");
            }
        }
        System.out.println();
    }
    static void monitoring_right_stack(){
        if(right_top==left_top){
            System.out.println("the right stack is empty");
        }else{
            for(int i=right_top;i>=left_top;i--){
                System.out.print(m_stack[i]+" ");
            }
        }
        System.out.println();
    }
    static void monitoring_multiple_stack(){
        if (left_top-1 < 0) {
            System.out.println("The stack is empty");
        } else {
            for (int i = right_top; i >= 0; i--) {
                System.out.print(m_stack[i] + " ");
            }
        }
        System.out.println();
    }
    static void multiple_stack_operation(){
        int option;
        System.out.println("Welcome to all the stack operation");
        System.out.println("press 0 to close stack operation");
        System.out.println("press 1 to insert left stack element ");
        System.out.println("press 2 to insert right stack element ");
        System.out.println("press 3 to monitoring left stack element");
        System.out.println("press 4 to monitoring right stack element");
        System.out.println("press 5 to monitoring all the stack element");
        do {
            System.out.println("Choose the option ");
            option = predator.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Stack operation is closed");
                    break;
                case 1:
                    push_left_stack();
                    break;
                case 2:
                    push_right_stack();
                    break;
                case 3:
                    monitoring_left_stack();
                    break;
                case 4:
                    monitoring_right_stack();
                    break;
                case 5:
                    monitoring_multiple_stack();
                    break;
                default:
                    System.out.println("Something went wrong " + option + " this value could not be happens ");

            }
        } while (option != 0);
    }
    public static void main(String[] args){
        multiple_stack_operation();
    }
}
