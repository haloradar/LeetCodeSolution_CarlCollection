package com.programmercarl.array.binarysearch;

/**给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

 请必须使用时间复杂度为 O(log n) 的算法。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/search-insert-position
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 还是边界问题，注意return r+1这个边界;
 * @author Administrator
 * @version 1.0
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1,mid;
        if(nums[l]>target){
            return 0;
        }else if(nums[r]<target){
            return r+1;
        }

        while (l<=r){
            mid=l+(r-l)>>2;
            if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else {
                return mid;
            }

        }
        return l;

    }
}
