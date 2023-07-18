package Competitive_Platform.Java_In_My_Way;

public class Queue {
    private int front;  // index of the front element
    private int rear;   // index of the rear element
    private int size;   // current size of the queue
    private int capacity;   // maximum capacity of the queue
    private int[] array;    // array to store queue elements

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.array = new int[capacity];
    }

    // method to add an element to the rear of the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full, cannot add element");
            return;
        }

        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size++;
        System.out.println(item + " enqueued to queue");
    }

    // method to remove the front element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot remove element");
            return -1;
        }

        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size--;
        return item;
    }

    // method to return the front element of the queue
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return this.array[this.front];
    }

    // method to check if the queue is empty
    public boolean isEmpty() {
        return (this.size == 0);
    }

    // method to check if the queue is full
    public boolean isFull() {
        return (this.size == this.capacity);
    }

    // method to return the size of the queue
    public int size() {
        return this.size;
    }
    public static void main(String[] args){
        Queue q=new Queue(2);
        q.enqueue(12);
        q.enqueue(23);
        q.enqueue(24);
        q.size();
    }
}
