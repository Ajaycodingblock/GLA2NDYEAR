import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue_UsingStack {
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Dequeue all elements into stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Step 2: Enqueue back from stack to queue (reversed)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Original Queue: " + q);
        reverse(q);
        System.out.println("Reversed Queue: " + q);
    }
}


// import java.util.LinkedList;
// import java.util.Queue;

// public class ReverseQueue_UsingRecursion {
//     public static void reverse(Queue<Integer> queue) {
//         if (queue.isEmpty()) return;

//         int data = queue.remove();      // Dequeue
//         reverse(queue);                 // Recursive call
//         queue.add(data);                // Enqueue back
//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         System.out.println("Original Queue: " + q);
//         reverse(q);
//         System.out.println("Reversed Queue: " + q);
//     }
// }
