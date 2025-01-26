package com.huhu.algorithm.learn.n1052;

/**
 * sliding window
 */
class SolutionB implements Solution {

    @Override
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int window = 0;
        for (int l = 0; l < minutes; l++) {
            window += customers[l] * grumpy[l];
        }
        int mx = window, n = customers.length;
        for (int r = minutes, l = 0; r < n; r++, l++) {
            window += customers[r] * grumpy[r] - customers[l] * grumpy[l];
            mx = Math.max(mx, window);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += customers[i] * (1 ^ grumpy[i]);
        }
        return res + mx;
    }

}
