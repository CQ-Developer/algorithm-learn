package com.huhu.algorithm.learn.solution.n2024;

/**
 * sliding window
 */
class Boo implements Solution {

    /**
     * 维持最大窗口
     */
    @Override
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] s = answerKey.toCharArray();
        int n = s.length, l = 0;
        for (int f = 0, t = 0, r = 0; r < n; r++) {
            if (s[r] == 'T') {
                t++;
            } else {
                f++;
            }
            if (Math.min(t, f) > k) {
                if (s[l] == 'T') {
                    t--;
                } else {
                    f--;
                }
                l++;
            }
        }
        return n - l;
    }

}
