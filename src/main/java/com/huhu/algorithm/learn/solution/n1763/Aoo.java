package com.huhu.algorithm.learn.solution.n1763;

/// # divide and conquer
class Aoo implements Solution {

    @Override
    public String longestNiceSubstring(String s) {
        boolean[] bigger = new boolean[27];
        boolean[] lower = new boolean[27];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lower[c & 31] = true;
            } else {
                bigger[c & 31] = true;
            }
        }
        for (int i = 1; i < 27; i++) {
            if (!bigger[i] && !lower[i]) {
                continue;
            }
            if (bigger[i] && lower[i]) {
                continue;
            }
            char c = (char) ((bigger[i] ? 'A' : 'a') + i - 1);
            var res = "";
            for (var _s : s.split(String.valueOf(c))) {
                var sub = longestNiceSubstring(_s);
                if (sub.length() > res.length()) {
                    res = sub;
                }
            }
            return res;
        }
        return s;
    }

}
