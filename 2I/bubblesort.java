public class bubblesort {
    public static void bbst(int[] arr) {
        int n = arr.length;
        // Outer loop controls the number of passes
        for (int i = 0; i < n-1 ; i++) {
            // Inner loop performs the actual comparison and swapping
            for (int j = 0; j < n - i-1 ; j++) {
                // Swap if the current element is smaller than the next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 6, 4};
        bbst(arr); // Call the sorting method
        
        // Print sorted array
        for (int itr : arr) {
            System.out.print(itr + " ");
        }
    }
}
