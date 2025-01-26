package com.huhu.algorithm.learn.n1052;

/**
 * sliding window
 */
class SolutionA implements Solution {

    @Override
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length, windwo = 0, mx = 0;
        for (int r = 0, l = 1 - minutes; r < n; r++, l++) {
            windwo += customers[r] * grumpy[r];
            if (l < 0) {
                continue;
            }
            mx = Math.max(mx, windwo);
            windwo -= customers[l] * grumpy[l];
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += customers[i] * (1 ^ grumpy[i]);
        }
        return res + mx;
    }

}
