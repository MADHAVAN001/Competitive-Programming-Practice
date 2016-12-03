public class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
	n[0] = 0;
	n[1] = 1;
	n[2] = 2;
	for(int i = 3;i<=n;i++)
		dp[i] = dp[i-1]+dp[i-2];
	return dp[n];
    }
}
