package com.programmercarl.string;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution151 {
    public String reverseWords(String s) {
        String s1 = deleteSpace(s);
        char[] chars = s1.toCharArray();
        int left=0,right=chars.length-1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(chars));
        int fast=0,slow=0;
        while (fast < chars.length) {
            if (chars[fast] == ' '||fast == chars.length - 1) {
                //反转
                left = slow;
                if (fast == chars.length - 1) {
                    right = fast;
                } else {
                    right = fast - 1;
                }
                while (left < right) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
                fast++;
                slow = fast;
            } else {
                fast++;
            }
        }

        return new String(chars);


    }

    private String deleteSpace(String s) {
        char[] array = s.toCharArray();
        //delete teh spare space
        int slow=1,fast=1;
        while (fast < array.length) {
            if (array[fast]==' '&&array[fast-1]==' ') {
                fast++;
            } else {
                if (fast != slow) {
                    array[slow] = array[fast];
                }
                fast++;
                slow++;
            }
        }
        int offset=0,count=slow;
        if (array[0] ==' ') {
            offset=1;
            count--;
        }
        if (array[slow-1] ==' ') {
            count--;
        }
        return new String(array,offset,count);
    }

    @Test
    public void test() {
        System.out.println(reverseWords("the sky is blue"));

    }
}
