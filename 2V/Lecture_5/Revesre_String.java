public class Revesre_String {
    
    // Method to reverse the string in-place
    public void reverseString(char[] s) {
        int point1 = 0;
        int point2 = s.length - 1;

        while (point2 > point1) {
            char temp = s[point1];
            s[point1] = s[point2];
            s[point2] = temp;
            point1++;
            point2--;
        }
    }

    // Main method to test the reverseString function
    public static void main(String[] args) {
        Revesre_String solution = new Revesre_String();

        // Sample input: reversing the string "hello"
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        
        System.out.println("Before reversal: " + new String(input));
        
        // Reverse the string using the reverseString method
        solution.reverseString(input);
        
        System.out.println("After reversal: " + new String(input));
    }
}
