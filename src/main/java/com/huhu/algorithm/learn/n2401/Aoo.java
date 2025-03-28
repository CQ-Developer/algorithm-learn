package com.huhu.algorithm.learn.n2401;

/**
 * sliding window & bit manipulation
 */
class Aoo implements Solution {

    @Override
    public int longestNiceSubarray(int[] nums) {
        int res = 0, n = nums.length;
        for (int mask = 0, l = 0, r = 0; r < n; mask |= nums[r++]) {
            for (; (mask & nums[r]) != 0; l++) {
                mask ^= nums[l];
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}
