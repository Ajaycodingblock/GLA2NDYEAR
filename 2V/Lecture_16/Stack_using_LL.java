class StackNode {
    int data;
    StackNode next;
    
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack_using_LL {
    private StackNode top;

    public Stack_using_LL() {
        this.top = null;
    }

    // Push operation
    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack Underflow");
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // Peek operation
    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display the stack
    public void display() {
        StackNode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Stack_using_LL stack = new Stack_using_LL();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack after pushing elements:");
        stack.display();
        
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        
        System.out.println("Stack after popping an element:");
        stack.display();
    }
}
