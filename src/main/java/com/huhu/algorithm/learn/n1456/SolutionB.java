package com.huhu.algorithm.learn.n1456;

/**
 * sliding window
 */
class SolutionB implements Solution {

    @Override
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        // setup window
        int mx = 0;
        for (int i = 0; i < k; i++) {
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                mx++;
            }
        }
        int res = mx, n = chars.length;
        for (int i = k; i < n; i++) {
            // right side enter the window
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                mx++;
            }
            // left side leave the window
            c = chars[i - k];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                mx--;
            }
            // update the window
            res = Math.max(res, mx);
        }
        return res;
    }

}
