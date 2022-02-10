package com.programmercarl.array.removeelement;

import java.util.function.IntUnaryOperator;

/**给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/remove-element
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 刚开始不会，重要！快慢指针法，实现一个for循环完成两个循环的工作，讲解：
 https://programmercarl.com/0027.%E7%A7%BB%E9%99%A4%E5%85%83%E7%B4%A0.html#%E6%80%9D%E8%B7%AF
 * @author Administrator
 * @version 1.0
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int l=0,r;
        for(r=0;r<nums.length;r++){
            if(nums[r]!=val){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;


    }

}
