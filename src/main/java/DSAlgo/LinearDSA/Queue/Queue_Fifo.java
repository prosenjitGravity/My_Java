package DSAlgo.LinearDSA.Queue;

import java.util.Scanner;

public class Queue_Fifo {
    static Scanner predator = new Scanner(System.in);
    static int queue[] = new int[10];
    static int front = -1;
    static int rear = -1;

    static void EnQueue() {
        if (rear == queue.length - 1) {
            System.out.println("Queue is OverFlow");
        } else {
            front = 0;
            System.out.println("enter element : ");
            int element = queue[++rear] = predator.nextInt();
            System.out.println(rear + " position " + element + " element is inserted");
        }
    }

    static void DeQueue() {
        if (front == -1 || front > rear) {
//            System.out.println("front : "+front+" & rear : "+rear);
            System.out.println("queue is UnderFlow");
        } else {
            int delete = queue[front];
            System.out.println(front + " index element " + delete + " is  deleted");
//            System.out.println("front : "+front+" & rear : "+rear);
            front++;
        }
    }

    static void Monitoring() {
        if (front == -1 || front > rear) {
            System.out.println("queue is empty");
        } else {
            System.out.println("----------------- Queue Elements Are --------------------");
            System.out.println("front is : " + front);
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    static void queue_operation() {
        int operation;
        System.out.println("press 0 to close queue operation");
        System.out.println("press 1 to insertion() -> element");
        System.out.println("press 2 to deletion() -> element");
        System.out.println("press 3 to monitoring -> element");
        do {
            System.out.println("choose option");
            operation = predator.nextInt();
            switch (operation) {
                case 0:
                    System.out.println("queue operation is closed");
                    break;
                case 1:
                    EnQueue();
                    break;
                case 2:
                    DeQueue();
                    break;
                case 3:
                    Monitoring();
                    break;
                default:
                    System.out.println("Something went wrong. your " + operation + " option doesn't exist ! into the queue operation");
            }
        } while (operation != 0);
    }

    public static void main(String[] args) {
        queue_operation();
    }
}
