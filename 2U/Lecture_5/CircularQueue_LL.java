// Node class
class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

// Circular Queue class using Linked List
public class CircularQueue_LL {
    Node front = null;
    Node rear = null;

    // Enqueue operation
    public void enqueue(int value) {
        Node newnode = new Node(value);

        if (front == null) {
            front = newnode;
            rear = newnode;
            rear.next = front;  // Point to itself to make it circular
        } else {
            rear.next = newnode;
            rear = newnode;
            rear.next = front;  // Maintain circular link
        }

        System.out.println(value + " enqueued to the circular queue.");
    }

    // Dequeue operation
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        if (front == rear) {  // Only one node
            System.out.println(front.data + " dequeued from the circular queue.");
            front = rear = null;
        } else {
            System.out.println(front.data + " dequeued from the circular queue.");
            front = front.next;
            rear.next = front;  // Maintain circular link
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

    // Display operation
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Circular Queue: ");
        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }

    // isEmpty check
    public boolean isEmpty() {
        return front == null;
    }

    // Main method to test the Circular Queue
    public static void main(String[] args) {
        CircularQueue_LL cq = new CircularQueue_LL();

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();  // Circular Queue: 10 20 30

        cq.peek();     // Front element is: 10

        cq.dequeue();  // 10 dequeued
        cq.display();  // Circular Queue: 20 30

        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();  // Circular Queue: 20 30 40 50

        cq.dequeue();  // 20 dequeued
        cq.peek();     // Front element is: 30
    }
}
