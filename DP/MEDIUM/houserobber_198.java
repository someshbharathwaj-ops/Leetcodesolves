package DP.MEDIUM;
/*
* Problem: 198 HOUSE ROBBER
 * Difficulty: MEDIUM
 * Link: https://leetcode.com/problems/house-robber/
 *
 * Approach:
 * - Use dynamic programming to store the maximum amount that can be robbed up to each house
 *
 * Time Complexity: O(n) where n is the number of houses
 * Space Complexity: O(n) for the dp array
 */

public class houserobber_198 {
   class solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[nums.length - 1];
    }
    
}
}