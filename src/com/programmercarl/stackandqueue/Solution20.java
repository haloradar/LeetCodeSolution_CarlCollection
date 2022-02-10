package com.programmercarl.stackandqueue;

import java.util.Stack;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()||
                        ch == ')' && stack.peek() != '(' ||
                        ch == ']' && stack.peek() != '[' ||
                        ch == '}' && stack.peek() != '{' ) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }

        return true;

    }
}
