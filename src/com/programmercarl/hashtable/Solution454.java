package com.programmercarl.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n=nums1.length;
        for (int n1 : nums1) {
            for (int n2 : nums2) {
                map.put(n1+n2,map.getOrDefault(n1+n2,0)+1);
            }
        }
        int sum=0;
        for (int n3 : nums3) {
            for (int n4 : nums4) {
                if (map.containsKey(-(n3 + n4))) {
                    sum+=map.get(-(n3+n4));
                }
            }
        }
        return sum;

        
    }
}
