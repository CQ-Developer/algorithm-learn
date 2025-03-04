package com.huhu.algorithm.learn.n2968;

import java.util.Arrays;

class Boo implements Solution {

    @Override
    public int maxFrequencyScore(int[] nums, long k) {
        Arrays.sort(nums);
        int res = 0;
        long sum = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            sum += nums[r] - nums[(l + r) >> 1];
            for (; sum > k; l++) {
                sum += nums[l] - nums[(l + r + 1) >> 1];
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}
