package com.programmercarl.array.shortestsubarray;

import static java.lang.Integer.min;

/**给定一个含有 n 个正整数的数组和一个正整数 target 。

 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 提交15次才通过！！！！！！！！！！！！
 解题思路：
 双指针滑动窗口，尤其注意最小长度刚好为数组长度的情况
 此解法只能得到正确的长度，但是输出的对应sum值有可能是超前一个循环的：
 * @author Administrator
 * @version 1.0
 */
public class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int len=nums.length+1;
        int l=0,r=0,sum=nums[0];
        while (true){
            if(sum<target){
                r++;
                if(r==nums.length){
                    break;
                }
                sum+=nums[r];
            }else{
                if((r-l+1)<len){
                    len=r-l+1;
                }

                sum-=nums[l++];
            }

        }
        if(len==nums.length+1) {
            len=0;
        }
        return len;

    }
}
