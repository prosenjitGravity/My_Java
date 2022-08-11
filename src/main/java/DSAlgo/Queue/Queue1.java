package DSAlgo.Queue;

import java.util.Scanner;

public class Queue1 {
    static int front = 0, rear = 0;
    static int queue[] = new int[10];
    static Scanner predator = new Scanner(System.in);

    public static void main(String[] args) {
        operation();
    }

    static void operation() {
        char option;
        System.out.println(" press 'e' to insert element into queue");
        System.out.println(" press 'd' to delete element into queue");
        System.out.println(" press 'm' to monitoring element into queue");
        System.out.println(" press 'q' to quite element into queue");
        do {
            System.out.println("Choose the option : ");
            option = predator.next().charAt(0);
            switch (option) {
                case 'e':
                    Enqueue();
                    break;
                case 'm':
                    Monitoring();
                    break;
                case 'd':
                    Dequeue();
                    break;
                case 'q':
                    System.out.println("queue program is quite");
                    break;
                default:
                    System.out.println("something went wrong " + option + " ?");
            }
        } while (option != 'q');
    }

    public static void Enqueue() {
        if (rear == queue.length) {
            System.out.println("Queue is OverFlow");
        } else {
            System.out.println("Enter the element to be insert into the Queue : ");
            int element = predator.nextInt();
            queue[rear] = element;
            System.out.println(queue[rear] + " element is inserted in index is  : " + rear);
            rear++;
        }
    }

    public static void Monitoring() {
        if (front >= rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void Dequeue() {
        if (front == rear) {
            System.out.println("Queue is UnderFlow");
        } else {
            int delete = queue[front];
            System.out.println(delete + " element is deleted into the queue");
            front++;
        }
    }
}
