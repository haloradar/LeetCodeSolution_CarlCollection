package com.programmercarl.hashtable;

import java.util.*;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution202 {
    public static void main(String[] args) {
        Solution202 solution202 = new Solution202();
        System.out.println(solution202.isHappy(19));
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum=n;

        while(sum!=1&&!set.contains(sum)){
            set.add(sum);
            sum = happySum(sum);
        }
        return sum==1;
    }

    private int happySum(int n){
        int sum=0;
        while (n!=0){
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
}
