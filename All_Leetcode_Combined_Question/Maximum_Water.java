class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int length = Math.min(height[left], height[right]);

            int width = (right - left);

            int currentArea = length * width ;

            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            }

            else {
                right--;
            }
        }

        return maxArea;
    }
}public class Maximum_Water {
    
}
