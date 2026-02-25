package DP.EASY;
/*
* Problem: 70 CLIMBING STAIRS   
    * Difficulty: EASY
    * Link: https://leetcode.com/problems/climbing-stairs/
    *
    * Approach:
    * - Use dynamic programming to store the number of ways to climb to each step
    *
    * Time Complexity: O(n) where n is the number of steps
    * Space Complexity: O(n) for the dp array
    */

public class climbingstairs_70 {
    class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

}
