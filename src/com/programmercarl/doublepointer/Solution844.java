package com.programmercarl.doublepointer;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        processStr(sArray);
        processStr(tArray);

        for (int i = 0; i < Math.min(sArray.length,tArray.length); i++) {
        }

        if (s.length() <= t.length()) {
            for (int i = 0; i < sArray.length; i++) {

                if (sArray[i] != tArray[i]) {
                    return false;
                }
            }
            if (sArray.length < tArray.length && tArray[sArray.length] != '#') {
                return false;
            }
        } else {
            for (int i = 0; i < tArray.length; i++) {

                if (tArray[i] != sArray[i]) {
                    return false;
                }
            }
            if (sArray[tArray.length] != '#') {
                return false;
            }
        }
        return true;

    }

    private void processStr(char[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '#') {
                int j=i;
                while (j >= 0) {
                    if (s[j] != '#') {
                        s[j] = '#';
                        break;
                    }
                    j--;
                }
            }
        }
        int slow = 0, fast = 0;
        while (fast < s.length) {
            if (s[fast] != '#') {
                if (fast != slow) {
                    s[slow] = s[fast];
                    s[fast] = '#';
                }
                slow++;
                fast++;
            } else {
                fast++;
            }
        }

    }
}
