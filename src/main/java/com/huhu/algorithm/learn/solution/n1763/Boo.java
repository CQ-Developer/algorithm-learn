package com.huhu.algorithm.learn.solution.n1763;

/// # divide and conquer
class Boo implements Solution {

    @Override
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) {
            return "";
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            c ^= 32;
            if (!s.contains(String.valueOf(c))) {
                var s1 = longestNiceSubstring(s.substring(0, i));
                var s2 = longestNiceSubstring(s.substring(i + 1));
                return s1.length() >= s2.length() ? s1 : s2;
            }
        }
        return s;
    }

}
