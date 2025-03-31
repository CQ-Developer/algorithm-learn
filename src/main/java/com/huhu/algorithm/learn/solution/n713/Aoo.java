package com.huhu.algorithm.learn.solution.n713;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        for (int p = 1, l = 0, r = 0; r < nums.length; r++) {
            p *= nums[r];
            for (; l <= r && p >= k; l++) {
                p /= nums[l];
            }
            res += r - l + 1;
        }
        return res;
    }

}
