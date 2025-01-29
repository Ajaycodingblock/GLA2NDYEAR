class Climbing_stairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return n;
        }
        
        int dp[] = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2; 

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Climbing_stairs solution = new Climbing_stairs();
        
        // Test with a sample input
        int n = 3; // Example input
        int result = solution.climbStairs(n);
        
        // Output the result
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
}
