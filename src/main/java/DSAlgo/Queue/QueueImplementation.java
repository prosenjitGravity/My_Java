package DSAlgo.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QueueImplementation {
    static int front = -1, rear = -1;
    static int queue[] = new int[5];
    static Scanner predator = new Scanner(System.in);

    static void Options() throws IOException {
        System.out.println("Press 'i' to enqueue element into the memory");
        System.out.println("Press 'd' to dequeue element into the memory");
        System.out.println("Press 'm' to monitoring all the memory element");
        System.out.println("Press 'q' to quite queue operations");
        char option;
        do {
            System.out.println("Enter the option below : ");
            option = predator.next().charAt(0);
            switch (option) {
                case 'i':
                    insert();
                    break;
                case 'd':
                    delete();
                    break;
                case 'm':
                    monitoring();
                    break;
                case 'q':
                    System.out.println("Quit Queue System");
                    break;
                default:
                    System.out.println("Something went wrong " + option + " cannot find ? ");
            }
        } while (option != 'q');
    }

    static void insert() throws IOException {
        if (rear == queue.length-1) {
            System.out.println("queue is OverFlow");
        } else if (front == -1 || rear == -1) {
            front = rear = 0;
        } else {
            System.out.println("Enter the element insert into the queue");
            int data = predator.nextInt();
            queue[rear] = data;
            System.out.println(queue[rear]+" element is inserted in "+rear+"th location");
            rear++;
        }
    }

    static void delete() {
        if (front == -1 || front > rear) {
            System.out.println("queue is Underflow");
        } else {
            int delete = queue[front];
            System.out.println(delete+" element is deleted ");
            front++;
            if (front > rear) {
                front = rear =-1;
            }
        }
    }

    static void monitoring() {
        if (front == -1 || rear == -1) {
            System.out.println("Queue memory is  empty");
        } else {
            for (int i = front ; i <=rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Options();
    }
}
