package com.programmercarl.stackandqueue;

import java.util.Stack;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        String str = "";
        while (!stack.isEmpty()) {
            str = stack.pop()+str;
        }
        return str;



    }
}
