
    public class Fibbonacci {
  
        // Recursive method to find the nth Fibonacci number
        public static int fibonacciRecursive(int n) {
          if (n <= 1) {
            return n;  // Base case: F(0) = 0, F(1) = 1
          }
          return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);  // Recursive step
        }
      
        public static void main(String[] args) {
          int n = 10;  // Fibonacci position we want to calculate
      
        //   System.out.println("Fibonacci series (Recursive approach) up to " + n + " terms:");
        //   for (int i = 0; i < n; i++) {
        //     System.out.print(fibonacciRecursive(i) + " ");
            //}

            System.out.println(fibonacciRecursive(n));
        }
      }
      

