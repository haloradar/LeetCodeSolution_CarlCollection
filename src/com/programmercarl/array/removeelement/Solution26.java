package com.programmercarl.array.removeelement;

/**给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。

 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 同样是快慢指针，此时两指针初始位置错开一位，与27的不同
 * @author Administrator
 * @version 1.0
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int l=0;
        for(int r=1;r<nums.length;r++){
            if(nums[l]!=nums[r]){
                nums[++l]=nums[r];
            }
        }

        return l+1;

    }
}
