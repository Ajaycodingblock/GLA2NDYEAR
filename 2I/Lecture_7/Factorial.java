public class Factorial {
    // Recursive method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
