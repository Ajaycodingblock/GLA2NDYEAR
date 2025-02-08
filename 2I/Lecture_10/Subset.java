import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        Arrays.sort(nums); // Optional: Sorting ensures subsets are generated in lexicographical order
        generateSubsets(allSubsets, new ArrayList<>(), nums, 0);
        return allSubsets;
    }

    public void generateSubsets(List<List<Integer>> allSubsets, List<Integer> currentSubset, int[] nums, int index) {
        allSubsets.add(new ArrayList<>(currentSubset)); // Add the current subset to the result
        
        // Loop through the remaining elements to build new subsets
        for (int i = index; i < nums.length; i++) {
            currentSubset.add(nums[i]); // Add current element to the current subset
            generateSubsets(allSubsets, currentSubset, nums, i + 1); // Recursively build further subsets
            currentSubset.remove(currentSubset.size() - 1); // Backtrack: remove the last element
        }
    }
}
