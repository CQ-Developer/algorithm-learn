package com.huhu.algorithm.learn.solution.n2379;

/**
 * sliding window
 */
class SolutionB implements Solution {

    @Override
    public int minimumRecolors(String blocks, int k) {
        char[] chars = blocks.toCharArray();
        int n = chars.length, res = k, w = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] == 'W') {
                w++;
            }
            if (i < k - 1) {
                continue;
            }
            res = Math.min(res, w);
            if (chars[i - k + 1] == 'W') {
                w--;
            }
        }
        return res;
    }

}
