import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // Sample input
        int[] arr = {10, 7, 8, 9, 1, 5};
        
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sort the array using Quick Sort
        quickSort(arr, 0, arr.length - 1);

        // Output the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the two parts
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Pivot is the last element
        int i = low - 1;        // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);  // Swap arr[i] and arr[j]
            }
        }

        // Swap the pivot element to its correct position
        swap(arr, i + 1, high);
        return i + 1;  // Return the pivot index
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
