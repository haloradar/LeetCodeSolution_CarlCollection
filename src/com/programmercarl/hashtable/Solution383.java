package com.programmercarl.hashtable;

import java.util.HashMap;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] magChars = magazine.toCharArray();
        for (char ch : magChars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char[] ranChars = ransomNote.toCharArray();
        for (char ch : ranChars) {
            map.put(ch,map.getOrDefault(ch,0)-1);
            if (map.get(ch)<0) {
                return false;
            }
        }
        return true;

    }
}
