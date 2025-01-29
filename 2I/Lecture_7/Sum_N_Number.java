public class Sum_N_Number {

    // Recursive function to calculate the Sum of n
    public static int Sum(int n) {
        if (n == 0) {
            return 0;  // Base case
        } 
        else {
            return  n+ Sum(n - 1);  // Recursive case
        }
    }

    public static void main(String[] args) {
        int number = 5;  // Example number to calculate Sum
        System.out.println(Sum(number));
    }
}
