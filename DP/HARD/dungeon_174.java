package DP.HARD;

/*
* Problem: 174 DUNGEON GAME
    * Difficulty: HARD
    * Link: https://leetcode.com/problems/dungeon-game/
    * Approach:
    * - Use dynamic programming to calculate the minimum health required at each cell starting from the bottom-right corner
    * - The health required at each cell is determined by the minimum health required to move to the right or down, minus the value of the current cell
    * - Ensure that the health never drops to zero or below (i.e., at least 1 health is required at each cell)
    * Time Complexity: O(m*n) where m and n are the dimensions of the dungeon grid
    * Space Complexity: O(m*n) for the dp array
    * 
    * 
 */

public class dungeon_174 {
    class Solution {
        public int calculateMinimumHP(int[][] dungeon) {
            int m = dungeon.length;
            int n = dungeon[0].length;
            int[][] dp = new int[m][n];
        
            // Start from the bottom-right corner
            dp[m - 1][n - 1] = Math.max(1, 1 - dungeon[m - 1][n - 1]);
            
            
            for (int j = n - 2; j >= 0; j--) {
                dp[m - 1][j] = Math.max(1, dp[m - 1][j + 1] - dungeon[m - 1][j]);
            }
            
            
            for (int i = m - 2; i >= 0; i--) {
                dp[i][n - 1] = Math.max(1, dp[i + 1][n - 1] - dungeon[i][n - 1]);
            }
            
            
            for (int i = m - 2; i >= 0; i--) {
                for (int j = n - 2; j >= 0; j--) {
                    int minHealthOnExit = Math.min(dp[i + 1][j], dp[i][j + 1]);
                    dp[i][j] = Math.max(1, minHealthOnExit - dungeon[i][j]);
                }
            }
            
            return dp[0][0];
        }
    
    }
}