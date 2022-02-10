package com.programmercarl.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        int[] resultArray=new int[result.size()];
        int i=0;
        for(int num:result){
            resultArray[i++]=num;
        }
        return resultArray;





    }
}
