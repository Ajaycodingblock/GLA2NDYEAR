public class Count_Vowel_constant {

    // Method to count vowels in a given string
    public static int countVowels(String str) {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";  // List of vowels (both lowercase and uppercase)

        // Loop through the string and count the vowels
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {  // Check if the character is a vowel
                vowelCount++;
            }
        }

        return vowelCount;
    }

    // Main method to test vowel counting
    public static void main(String[] args) {
        // Sample input string
        String inputString = "Hello World!";
        
        // Call the countVowels method
        int vowelCount = countVowels(inputString);
        
        // Output the result
        System.out.println("Number of vowels in \"" + inputString + "\": " + vowelCount);
    }
}
