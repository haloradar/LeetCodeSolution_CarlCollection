package com.programmercarl.hashtable;

/**
 * @author Administrator
 * @version 1.0
 */
public class Solution242 {
    public boolean isAnagram(String s, String t) {
        int[] visit=new int[26];
        for(char c: s.toCharArray()){
            visit[c-'a']++;
        }
        for(char c : t.toCharArray()){
            visit[c-'a']--;
        }
        for (int i=0;i<26;i++){
            if(visit[i]!=0){
                return false;
            }
        }
        return true;


    }
}
