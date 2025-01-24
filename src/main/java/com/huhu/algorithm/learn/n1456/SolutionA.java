package com.huhu.algorithm.learn.n1456;

/**
 * sliding window
 */
class SolutionA implements Solution {

    @Override
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int mx = 0, res = 0, n = chars.length;
        for (int i = 0; i < n; i++) {
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                mx++;
            }
            // window is not full
            if (i < k - 1) {
                continue;
            }
            // window is full
            res = Math.max(mx, res);
            // left side will leave the window
            c = chars[i - k + 1];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                mx--;
            }
        }
        return res;
    }

}
