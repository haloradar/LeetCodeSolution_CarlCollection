package com.programmercarl.string;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution344 {
    public void reverseString(char[] s) {
        char ch;
        int left=0,right=s.length-1;
        while (left < right) {
            ch=s[left];
            s[left]=s[right];
            s[right] = ch;
            left++;
            right--;
        }

    }
}
