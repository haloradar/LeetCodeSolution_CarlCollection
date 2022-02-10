package com.programmercarl.doublepointer;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] == 0) {
                fast++;
            } else {
                if (slow != fast) {
                    nums[slow] = nums[fast];
                    nums[fast] = 0;
                }
                slow++;
                fast++;
            }

        }
    }
}
