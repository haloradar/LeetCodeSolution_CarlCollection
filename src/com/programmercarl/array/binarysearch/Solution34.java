package com.programmercarl.array.binarysearch;

/**给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

 如果数组中不存在目标值 target，返回 [-1, -1]。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 此代码还有优化空间：寻找index左右边界时可分别都用二分法查找
 * @author Administrator
 * @version 1.0
 */
public class Solution34 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        Solution34 solution34 = new Solution34();
        int[] ints = solution34.searchRange(nums, target);
        System.out.println(ints);


    }

    public int[] searchRange(int[] nums, int target) {

        int l=0,r=nums.length-1,mid,find=-1;
        int[] index=new int[2];
        if(r<0){
            return new int[]{-1,-1};
        }
        if(nums[l]>target||nums[r]<target){
            return new int[]{-1,-1};
        }

        while (l<=r){
            mid=(l+r)/2;
            if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else {
                find=mid;
                break;//注意break
            }
        }


        if(find!=-1){
            index[0]=find;
            index[1]=find;
            while ((index[1]+1)<nums.length&&nums[index[1]+1]==target){
                index[1]++;
            }
            while ((index[0]-1)>=0&&nums[index[0]-1]==target){
                index[0]--;
            }
            return index;
        }

        index[0]=-1;
        index[1]=-1;
        return index;

    }
}
