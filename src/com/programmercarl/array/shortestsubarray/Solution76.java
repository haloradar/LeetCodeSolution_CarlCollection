package com.programmercarl.array.shortestsubarray;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

/**给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。

  

 注意：

 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
 如果 s 中存在这样的子串，我们保证它是唯一的答案。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/minimum-window-substring
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 HARD
 解题思路：
 滑动窗口
 * @author Administrator
 * @version 1.0
 */
public class Solution76 {
    public String minWindow(String s, String t) {
        int[] srcHave=new int[127];
        int[] targetHave =new int[127];
        int l=0;
        int fitNum=0,targetKind=0;//
        int len=s.length()+1,smallL=0,smallR=0;
        for(int i=0;i<t.length();i++){
            targetHave[t.charAt(i)]++;
            if(targetHave[t.charAt(i)]==1){
                targetKind++;
            }
        }

        for(int r=0; r<s.length();r++){
            srcHave[s.charAt(r)]++;
            if(targetHave[s.charAt(r)]!=0&&srcHave[s.charAt(r)]==targetHave[s.charAt(r)]){
                fitNum++;
            }

            while(l<s.length()&&srcHave[s.charAt(l)]>targetHave[s.charAt(l)]){
                srcHave[s.charAt(l++)]--;
            }
            if(fitNum==targetKind){
                if((r-l+1)<len){
                    len=r-l+1;
                    smallL=l;
                    smallR=r;
                }
            }
        }
        if(len==s.length()+1){
            return new String();
        }
        return new String(s.toCharArray(),smallL, len);


    }
}
