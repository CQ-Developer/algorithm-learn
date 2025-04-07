package com.huhu.algorithm.learn.solution.n2070;

import java.util.Arrays;

/**
 * binary search
 */
class Aoo implements Solution {

    @Override
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int n = items.length;
        int[] left = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = Math.max(left[i], items[i][1]);
        }
        n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = left[search(items, queries[i])];
        }
        return res;
    }

    private int search(int[][] items, int target) {
        int l = -1, r = items.length;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (items[m][0] > target) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

}
