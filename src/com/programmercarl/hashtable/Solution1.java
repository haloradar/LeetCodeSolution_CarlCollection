package com.programmercarl.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        int[] result=new int[2];
        for(int i:nums){
            set.add(i);
        }
        for(int  i=0;i<nums.length;i++){
            if(set.contains(target-nums[i])){

                for(int j=0;j<nums.length;j++){
                    if(nums[j]==target-nums[i]&&i!=j){

                        if(i>j){
                            result[0]=j;
                            result[1]=i;
                        }else {
                            result[0]=i;
                            result[1]=j;
                        }
                        return result;
                    }
                }
            }
        }
        return result;

    }
}
