// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         //int ans[] = new int[temperatures.length];
//         Stack <Integer> st  = new Stack <>();

//         // for (int i = 0; i < temperatures.length; i++) {
//         //     int temp = temperatures[i];
//         //     ans[i] = 0;

//         //     for (int j = i + 1; j < temperatures.length; j++) { 
//         //         if (temperatures[j] > temp) {
//         //             ans[i] = j - i; 
//         //             break;
//         //         }
//         //     }
//         // }
//         // return ans;
//     }
// }

class Daily_Temp {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n]; // This will store the answer
        Stack<Integer> stack = new Stack<>(); // Stack to store indexes of temperatures

        for (int i = 0; i < n; i++) {
            // If current temperature is higher than the temperature at the index on top of the stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop(); // Get the index with lower temperature
                result[prevIndex] = i - prevIndex; // Calculate the days waited
            }
            stack.push(i); // Push current index into the stack
        }

        return result; // Return the result array
    }
}


