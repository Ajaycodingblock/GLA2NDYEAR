import java.util.Arrays;

public class Product_Of_Array {
    
    // Function to compute the product of array except self
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // Create arrays to store the left and right products
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        
        // Initialize the first element of left as 1
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        
        // Initialize the last element of right as 1
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }
        
        // Calculate the result by multiplying the corresponding elements from left and right arrays
        for (int j = 0; j < n; j++) {
            ans[j] = left[j] * right[j];
        }
        
        return ans;
    }
    
    // Main method to test the function
    public static void main(String[] args) {
        // Create an instance of the Product_Of_Array class
        Product_Of_Array solution = new Product_Of_Array();
        
        // Test case 1
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Product Except Self: " + Arrays.toString(solution.productExceptSelf(nums1)));  
        // Expected Output: [24, 12, 8, 6]
        
        // Test case 2
        int[] nums2 = {5, 1, 3, 4};
        System.out.println("Product Except Self: " + Arrays.toString(solution.productExceptSelf(nums2)));  
        // Expected Output: [12, 60, 20, 15]
        
        // Test case 3
        int[] nums3 = {1, 2};
        System.out.println("Product Except Self: " + Arrays.toString(solution.productExceptSelf(nums3)));  
        // Expected Output: [2, 1]
    }
}
