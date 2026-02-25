package ARRAYS.EASY;
/*
* Problem: 1929. Concatenation of Array
 * Difficulty: EASY
 * Link: https://leetcode.com/problems/concatenation-of-array/
 *
 * Approach:
 * - Create a new array of size 2n and fill it with elements from the original array twice
 *
 * Time Complexity: O(n) where n is the length of the input array
 * Space Complexity: O(n) for the output array
 */

public class concatenate2array_1929 {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] result = new int[2 * n];
            for (int i = 0; i < n; i++) {
                result[i] = nums[i];
                result[i + n] = nums[i];
            }
            return result;
        }
    }
}