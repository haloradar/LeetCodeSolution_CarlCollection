package com.programmercarl.stackandqueue;

import org.junit.Test;
import sun.nio.cs.ext.MacArabic;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int len = nums.length - k + 1;
        int[] result = new int[len];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (true) {
                if (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                    deque.pollLast();
                } else {
                    deque.offerLast(nums[i]);
                    break;
                }
            }
        }
        result[0] = deque.peekFirst();
        for (int i = 1; i < len; i++) {
            if (deque.peekFirst() == nums[i-1]) {
                deque.pollFirst();
            }

            while (true) {
                if (!deque.isEmpty() && deque.peekLast() < nums[i+k-1]) {
                    deque.pollLast();
                } else {
                    deque.offerLast(nums[i+k-1]);
                    break;
                }
            }
            result[i] = deque.peekFirst();
        }

        return result;
    }

    @Test
    public void test() {
        int[] a = {1,3,-1,-3,5,3,6,7};
        int k=3;

        int[] ints = maxSlidingWindow(a, k);
        for (int n : ints) {
            System.out.println(n);
        }
    }
}
