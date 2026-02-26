package ARRAYS.EASY;
/*
* Problem: 485. Max Consecutive Ones
 * Difficulty: EASY
 * Link: https://leetcode.com/problems/max-consecutive-ones/
 *
 * Approach:
 * - Iterate through the array and count consecutive ones, updating the maximum count when a zero is encountered
 *
 * Time Complexity: O(n) where n is the length of the input array
 * Space Complexity: O(1) for the count variables
 */

public class maxconsecutiveone_485 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxCount = 0;
            int currentCount = 0;

            for (int num : nums) {
                if (num == 1) {
                    currentCount++;
                } else {
                    maxCount = Math.max(maxCount, currentCount);
                    currentCount = 0;
                }
            }
           
            return Math.max(maxCount, currentCount);
        }
    }
}