public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        // Initialize the largest and second largest values to the smallest possible integer value
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the largest and second largest elements
        for (int num : arr) {
            // If the current number is greater than the largest, update both largest and second largest
            if (num > largest) {
                secondLargest = largest;  // Move the current largest value to second largest
                largest = num;            // Update the largest with the new largest value
            } 
            // If the current number is between largest and second largest, update second largest
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Return the second largest number found in the array
        return secondLargest;
    }

    public static void main(String[] args) {
        // Example array to test the method
        int[] arr = {12, 35, 1, 10, 34, 1};
        // Print the second largest element
        System.out.println("Second largest element is: " + findSecondLargest(arr));
    }
}
