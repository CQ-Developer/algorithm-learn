package com.huhu.algorithm.learn.solution.n2024;

/**
 * sliding window
 */
class Aoo implements Solution {

    /**
     * 使用{@code t}和{@code f}分别记录{@code l...r}窗口内,
     * 'T'和'F'字符的数量.
     */
    @Override
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] s = answerKey.toCharArray();
        int n = s.length, mx = 0;
        for (int f = 0, t = 0, l = 0, r = 0; r < n; r++) {
            if (s[r] == 'T') {
                t++;
            } else {
                f++;
            }
            for (; Math.min(t, f) > k; l++) {
                if (s[l] == 'T') {
                    t--;
                } else {
                    f--;
                }
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }

}
