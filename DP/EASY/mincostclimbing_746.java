package DP.EASY;
/*
* Problem: 746. Min Cost Climbing Stairs
 * Difficulty: EASY
 * Link: https://leetcode.com/problems/min-cost-climbing-stairs/
 *
 * Approach:
 * - Use dynamic programming to store the minimum cost to reach each step
 *
 * Time Complexity: O(n) where n is the number of steps
 * Space Complexity: O(n) for the dp array
 */

public class mincostclimbing_746 {
   class solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        return dp[n];
    } 
}
}