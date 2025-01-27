package com.huhu.algorithm.learn.n1423;

/**
 * dynamic programming - TLE
 */
class Boo implements Solution {

    @Override
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int[] f = new int[n + 1];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - k + i; j < n; j++) {
                f[j + 1] = Math.max(f[j + 1] + cardPoints[i], f[j] + cardPoints[j]);
            }
        }
        return f[n];
    }

}
