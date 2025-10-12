public class ClimeStairs {
    
    

    public static int helper(int n, int[] dp) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        if (dp[n] != 0) {
            return dp[n]; // already calculated
        }
        dp[n] = helper(n - 1, dp) + helper(n - 2, dp); // save result
        return dp[n];
    }
    public static int climbStairs(int n) {
        int[] dp = new int[n + 1]; // store results
        return helper(n, dp);
    }

    public static void main(String[] args){
        int ans=climbStairs(32);
        System.out.println(ans);

    }
}
