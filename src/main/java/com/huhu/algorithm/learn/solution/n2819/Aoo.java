package com.huhu.algorithm.learn.solution.n2819;

import java.util.Arrays;

class Aoo implements Solution {

    @Override
    public long[] minimumRelativeLosses(int[] prices, int[][] queries) {
        int n = prices.length;
        Arrays.sort(prices);
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + prices[i];
        }
        int m = queries.length;
        long[] res = new long[m];
        for (int i = 0; i < m; i++) {
            int ki = queries[i][0], mi = queries[i][1];
            int l = search(prices, ki, mi), r = mi - l;
            res[i] = pre[l] + 2L * ki * r - (pre[n] - pre[n - r]);
        }
        return res;
    }

    /**
     * binary search
     */
    private int search(int[] prices, int ki, int mi) {
        int l = 0, r = Arrays.binarySearch(prices, ki);
        if (r < 0) {
            r = -r - 1;
        }
        r = Math.min(mi, r);
        int n = prices.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (prices[m] < 2L * ki - prices[n - (mi - m)]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return r;
    }

}
