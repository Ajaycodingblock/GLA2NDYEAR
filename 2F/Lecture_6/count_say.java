public class CountAndSay {

    public static String countAndSay(int n) {
        if (n <= 0) 
        return "";

        String result = "1";
        for (int i = 2; i <= n; i++) {
            result = buildNext(result);
        }
        return result;
    }

    private static String buildNext(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char currentChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(count).append(currentChar);
                currentChar = s.charAt(i);
                count = 1;
            }
        }

        // Append the last group
        sb.append(count).append(currentChar);

        return sb.toString();
    }

    public static void main(String[] args) {
        int input = 5;
        String result = countAndSay(input);
        System.out.println("Count and Say of " + input + ": " + result);
    }
}
