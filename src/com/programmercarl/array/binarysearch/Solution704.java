package com.programmercarl.array.binarysearch;

/**给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/binary-search
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 主要考虑边界条件，此为左闭右闭情况
 还可以考虑左闭右开情况
 * @author Administrator
 * @version 1.0
 */
public class Solution704 {
    public int search(int[] nums,int target ){
        int l=0,r=nums.length-1,mid=(l+r)/2;
        if(nums[l]>target||nums[r]<target) {
            return -1;
        }
        while (l<=r){
            mid=(l+r)/2;

            if(nums[mid]>target){
                r=mid-1;//原因是mid一定不是目标值，所以-1
            }else if(nums[mid]<target){
                l=mid+1;
            }else if(nums[mid]==target){
                return mid;
            }
        }


        return -1;

    }
}
