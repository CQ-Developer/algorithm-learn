package com.huhu.algorithm.learn.n930;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        return f(nums, n, goal) - f(nums, n, goal + 1);
    }

    private int f(int[] nums, int n, int goal) {
        int res = 0;
        for (int s = 0, l = 0, r = 0; r < n; r++) {
            s += nums[r];
            for (; l <= r && s >= goal; l++) {
                s -= nums[l];
            }
            res += l;
        }
        return res;
    }

}
