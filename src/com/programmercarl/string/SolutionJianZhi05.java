package com.programmercarl.string;

/**
 * @author Administrator
 * @version 1.0
 */
public class SolutionJianZhi05 {
    public String replaceSpace(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
}
