package DSAlgo.LinearDSA.Queue;


class Queue {
    private int[] data;  // Array to store the elements of the queue
    private int front;  // Index of the front element of the queue
    private int rear;   // Index of the rear element of the queue
    private int size;   // Current size of the queue
    private int capacity;  // Maximum capacity of the queue

    // Initialize a queue with a given capacity
    public Queue(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = capacity - 1;
        size = 0;
        data = new int[capacity];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    // Check if the queue is full
    public boolean isFull() {
        return (size == capacity);
    }

    // Add an element to the queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;  // Increment rear and wrap around if necessary
        data[rear] = element;
        size++;
    }

    // Remove and return the front element of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;  // Return a sentinel value to indicate an error
        }
        int element = data[front];
        front = (front + 1) % capacity;  // Increment front and wrap around if necessary
        size--;
        return element;
    }

    // Return the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;  // Return a sentinel value to indicate an error
        }
        return data[front];
    }
}

public class Fifo {
    public static void main(String[] args) {
        Queue queue = new Queue(5);  // Create a queue with a capacity of 5
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Front element: " + queue.peek());  // Output: Front element: 1
        System.out.println("Dequeued element: " + queue.dequeue());  // Output: Dequeued element: 1
        System.out.println("Dequeued element: " + queue.dequeue());  // Output: Dequeued element: 2
        System.out.println("Front element: " + queue.peek());  // Output: Front element: 3
    }
}
