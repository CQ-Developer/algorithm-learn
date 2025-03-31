package com.huhu.algorithm.learn.solution.n930;

/**
 * sliding window
 */
class Boo implements Solution {

    @Override
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0, n = nums.length;
        for (int s1 = 0, s2 = 0, l1 = 0, l2 = 0, r = 0; r < n; r++) {
            s1 += nums[r];
            for (; l1 <= r && s1 >= goal; l1++) {
                s1 -= nums[l1];
            }
            s2 += nums[r];
            for (; l2 <= r && s2 >= goal + 1; l2++) {
                s2 -= nums[l2];
            }
            res += l1 - l2;
        }
        return res;
    }

}
