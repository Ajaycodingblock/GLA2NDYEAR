import java.util.Arrays;

class Prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Sort the array
        Arrays.sort(strs);
        
        // Compare the first and last strings
        String first = strs[0];
        String last = strs[strs.length - 1];
        String s = "";
        int minlen = Math.min(first.length(), last.length());

        // Iterate up to the length of the shortest string between first and last
        for (int i = 0; i < minlen; i++) {

            if (first.charAt(i) == last.charAt(i)) {
                s += first.charAt(i);  // Append the character to the result
            } 
            
            else {
                break;  // Stop as soon as characters don't match
            }
        }
        
        // Return the common prefix
        return s;
    }

    public static void main(String[] args) {
        // Example test case
        Prefix solution = new Prefix();

        // Test 1
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs1));  // Output: "fl"

        // Test 2
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs2));  // Output: ""

        // Test 3
        String[] strs3 = {"intermediate", "internet", "internal"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs3));  // Output: "inte"
    }
}
