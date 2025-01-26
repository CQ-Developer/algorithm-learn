package com.huhu.algorithm.learn.n2379;

/**
 * sliding window
 */
class SolutionA implements Solution {

    @Override
    public int minimumRecolors(String blocks, int k) {
        char[] chars = blocks.toCharArray();
        int w = 0;
        for (int i = 0; i < k; i++) {
            if (chars[i] == 'W') {
                w++;
            }
        }
        int res = w, n = chars.length;
        for (int i = k; i < n; i++) {
            if (chars[i] == 'W') {
                w++;
            }
            if (chars[i - k] == 'W') {
                w--;
            }
            res = Math.min(res, w);
        }
        return res;
    }

}
