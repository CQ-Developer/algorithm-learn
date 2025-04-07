package com.huhu.algorithm.learn.solution.n2563;

import java.util.Arrays;

/**
 * binary search
 */
class Aoo implements Solution {

    @Override
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            int l = search(nums, i, lower - nums[i]);
            int r = search(nums, i, upper - nums[i] + 1);
            res += r - l;
        }
        return res;
    }

    private int search(int[] nums, int l, int target) {
        int r = nums.length;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= target) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

}
