class First_Unique_char {
    public char firstUniqChar(String s) {
        // Create a frequency table for characters (assuming lowercase English letters)
        int[] freq = new int[26];
        
        // First pass: Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }
        
        // Second pass: Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }
        
        // If no unique character found, return a placeholder (can be any character)
        return '-';
    }

    public static void main(String[] args) {
        First_Unique_char solution = new First_Unique_char();
        
        String input = "leetcode";
        char result = solution.firstUniqChar(input);
        
        if (result != '-') {
            System.out.println("The first unique character is: " + result);
        } else {
            System.out.println("No unique character found.");
        }
    }
}
