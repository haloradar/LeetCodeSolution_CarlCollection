package com.programmercarl.array.shortestsubarray;

/**在一排树中，第 i 棵树产生 tree[i] 型的水果。
 你可以从你选择的任何树开始，然后重复执行以下步骤：

 把这棵树上的水果放进你的篮子里。如果你做不到，就停下来。
 移动到当前树右侧的下一棵树。如果右边没有树，就停下来。
 请注意，在选择一颗树后，你没有任何选择：你必须执行步骤 1，然后执行步骤 2，然后返回步骤 1，然后执行步骤 2，依此类推，直至停止。

 你有两个篮子，每个篮子可以携带任何数量的水果，但你希望每个篮子只携带一种类型的水果。

 用这个程序你能收集的水果树的最大总量是多少？

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/fruit-into-baskets
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 思路：
 等价于最多只存在两个不同数字的最长连续子序列有多长
 * @author Administrator
 * @version 1.0
 */
public class Solution904 {
    public int totalFruit(int[] fruits) {
        int l=0,kindSum=0,result=0;
        //采用hash数组储存篮子内有哪几种水果和水果的数量，
        // 数组角标代表水果种类，对应位置的元素代表此时篮子里此类水果的个数
        int[] have=new int[fruits.length];
        for(int r=0;r<fruits.length;r++){
            have[fruits[r]]++;
            //下句判断篮子里是否新增水果种类，
            // 上句放入一个水果后have[]才等于1，代表未放之前篮子里没有这种水果，因此判断新增了一种水果
            if(have[fruits[r]]==1){
                kindSum++;
            }
            while(kindSum>2){
                have[fruits[l]]--;
                //下句if如果为真代表代表拿出一个水果后，篮子里少了一种水果，因此kindSum减1
                if(have[fruits[l]]==0){
                    kindSum--;
                }
                l++;
            }
            if((r-l+1)>result){
                result=r-l+1;
            }
        }

        return result;
    }


}
