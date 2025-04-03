package com.huhu.algorithm.learn.solution.n2389;

import java.util.Arrays;

/**
 * binary search
 */
class Boo implements Solution {

    @Override
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        int n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = search(nums, queries[i]);
        }
        return res;
    }

    /**
     * (l...r)
     */
    private int search(int[] nums, int tar) {
        int l = -1, r = nums.length;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (nums[i] > tar) {
                r = i;
            } else {
                l = i;
            }
        }
        return r;
    }

}
