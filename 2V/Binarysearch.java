public class Binarysearch {

    public static int binarysearch(int[] arr, int t) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) { 
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Return  possible index
        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8};
        int target = 9;
        int result = binarysearch(arr, target);

        // Print the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
