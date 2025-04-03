package com.huhu.algorithm.learn.solution.n2389;

import java.util.Arrays;

/**
 * binary search
 */
class Aoo implements Solution {

    @Override
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }
        int m = queries.length;
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            res[i] = search(pre, queries[i]) - 1;
        }
        return res;
    }

    /**
     * (l...r)
     */
    private int search(int[] pre, int tar) {
        int l = -1, r = pre.length;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (pre[i] > tar) {
                r = i;
            } else {
                l = i;
            }
        }
        return r;
    }

}
