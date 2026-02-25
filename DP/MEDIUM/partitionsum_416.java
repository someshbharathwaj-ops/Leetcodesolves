package DP.MEDIUM;
/*
* Problem: 416 PARTTION EQUAL SUBSET SUM
 * Difficulty: MEDIUM
 * Link: https://leetcode.com/problems/partition-equal-subset-sum/
 *
 * Approach:
 * - Use dynamic programming to determine if a subset sum equals half of total sum
 * - If total sum is odd, return false immediately
 *
 * Time Complexity: O(n.target) where n is the number of elements and target is sum/2
 * Space Complexity: O(n.target) for the dp array
 */

public class partitionsum_416 {

    class Solution {

    Boolean[][] dp;

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) return false;

        int target = sum / 2;

        dp = new Boolean[nums.length][target + 1];

        return knapsack(nums, 0, target);
    }

    public boolean knapsack(int[] nums, int index, int weight) {

        if (weight == 0) return true;

        if (index >= nums.length || weight < 0)
            return false;

        if (dp[index][weight] != null)
            return dp[index][weight];

        boolean take = knapsack(nums, index + 1, weight - nums[index]);
        boolean skip = knapsack(nums, index + 1, weight);

        dp[index][weight] = take || skip;

        return dp[index][weight];
    }
}
}