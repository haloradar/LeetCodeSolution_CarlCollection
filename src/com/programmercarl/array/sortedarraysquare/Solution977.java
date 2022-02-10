package com.programmercarl.array.sortedarraysquare;

import org.junit.Test;

import java.awt.*;


import static java.lang.Math.abs;

/**给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，
 * 要求也按 非递减顺序 排序。
 * 题解：
 * 仍然是采用双指针法（严格来说是三指针），平方最大的元素从原数组两端找，最小的在原数组中间找
 * 因此两指针分别指原数组两端，比平方大小，大的就放在result数组最右边，然后对应指针往中间移动一格
 * @author Administrator
 * @version 1.0
 */
public class Solution977 {
    @Test
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int l=0,r=nums.length-1,index=nums.length-1;
        while (l<=r){
            if(abs(nums[l])>abs(nums[r])){
                result[index--]=nums[l]*nums[l];
                l++;
            }else{
                result[index--]=nums[r]*nums[r];
                r--;
            }
        }
        return result;
    }
}
