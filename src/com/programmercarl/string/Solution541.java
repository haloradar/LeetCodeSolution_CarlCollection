package com.programmercarl.string;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution541 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int start=0,left,right;
        while (start < chars.length - 1) {

            left=start;
            if(start+k<chars.length){
                right=start+k-1;
            }else {
                right=chars.length-1;
            }
            while(left<right){
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
            start+=2*k;
        }

        return new String(chars);
    }
}
