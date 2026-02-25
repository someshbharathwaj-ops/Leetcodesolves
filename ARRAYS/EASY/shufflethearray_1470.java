package ARRAYS.EASY;
/*
 * Problem: 1470. Shuffle the Array
 * Difficulty: EASY
 * Link: https://leetcode.com/problems/shuffle-the-array/
 *
 * Approach:
 * - Create a new array of size 2n
 * - For each index i in the range [0, n), place nums[i] at index 2*i and nums[i+n] at index 2*i+1
 *
 * Time Complexity: O(n) where n is the length of the input array
 * Space Complexity: O(n) for the output array
 */

public class shufflethearray_1470 {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] result = new int[2 * n];
            for (int i = 0; i < n; i++) {
                result[2 * i] = nums[i];
                result[2 * i + 1] = nums[i + n];
            }
            return result;
        }
    }
    
}
