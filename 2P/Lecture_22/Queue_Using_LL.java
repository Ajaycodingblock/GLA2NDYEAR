// Node class - represents each element in the queue
class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

// Queue class using Linked List
public class Queue_Using_LL {
    Node front = null;
    Node rear = null;

    // Enqueue operation
    public void enqueue(int value) {
        Node newnode = new Node(value);

        if (rear == null) {
            front = newnode;
            rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }
        System.out.println(value + " enqueued to the queue.");
    }

    // Dequeue operation
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println(front.data + " dequeued from the queue.");
        front = front.next;

        // If front becomes null, update rear to null as well
        if (front == null) {
            rear = null;
        }
    }

    // Peek operation
    public void peek() {
        if (front == null) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Front element is: " + front.data);
        }
    }

    // Display the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Queue_Using_LL q = new Queue_Using_LL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();      // Should print: Queue: 10 20 30
        q.peek();         // Should print: Front element is: 10
        q.dequeue();      // Should print: 10 dequeued from the queue
        q.display();      // Should print: Queue: 20 30
        q.peek();         // Should print: Front element is: 20
    }
}
