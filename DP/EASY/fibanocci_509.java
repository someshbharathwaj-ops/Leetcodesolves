package DP.EASY;
/*
* Problem: 509 FIBANOCI
 * Difficulty: EASY
 * Link: https://leetcode.com/problems/fibonacci-number/
 *
 * Approach:
 * - Use dynamic programming to store previously computed Fibonacci numbers
 *
 * Time Complexity: O(n) where n is the input number
 * Space Complexity: O(n) for the dp array
 */

public class fibanocci_509 {
class Solution {
    public int fib(int n) {
        if(n==0) return 0 ; 
        if (n==1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;   
        for (int i = 2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
}
}