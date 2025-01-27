package com.huhu.algorithm.learn.n1423;

import java.util.Arrays;

/**
 * depth first search - MLE
 */
class Aoo implements Solution {

    @Override
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int[][] mem = new int[n][n];
        for (int[] a : mem) {
            Arrays.fill(a, -1);
        }
        return f(cardPoints, k, 0, n - 1, mem);
    }

    private int f(int[] p, int k, int l, int r, int[][] mem) {
        if (k == 0) {
            return 0;
        }
        if (mem[l][r] != -1) {
            return mem[l][r];
        }
        return mem[l][r] = Math.max(f(p, k - 1, l + 1, r, mem) + p[l], f(p, k - 1, l, r - 1, mem) + p[r]);
    }

}
