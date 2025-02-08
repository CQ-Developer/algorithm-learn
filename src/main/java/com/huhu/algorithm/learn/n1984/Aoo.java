package com.huhu.algorithm.learn.n1984;

import java.util.Arrays;

/**
 * sliding window - AC
 */
class Aoo implements Solution {

    @Override
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = nums[k - 1] - nums[0];
        for (int i = k; i < nums.length; i++) {
            res = Math.min(res, nums[i] - nums[i - k + 1]);
        }
        return res;
    }

}
