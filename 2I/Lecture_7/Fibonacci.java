public class Fibonacci {
    // Recursive method to return the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: if n is 0 or 1, return n
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        int n = 10; // Find the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
