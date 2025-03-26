class Node {
    int val;
    Node next;
    
    Node(int val)
    {
        this.val = val;
        this.next = null;
    }
}

public class Stack_using_LL {
    public static Node head;
    
    public static void push(int val) {
       Node newnode = new Node(val);
       newnode.next = head;
       head = newnode;
    }
    
    public static int pop() {
       
        int temp = head.val;
        head = head.next;
        return temp;
    }
    
    public static int peek() {
       
        return head.val;
    }
    
    public static boolean isEmpty() {
        return head == null;
    }
    
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        
        System.out.println("Top element is: " + peek());
        System.out.println("Popped element is: " + pop());
        System.out.println("Popped element is: " + pop());
        System.out.println("Top element after pop: " + peek()); 
}
}