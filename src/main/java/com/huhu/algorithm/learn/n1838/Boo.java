package com.huhu.algorithm.learn.n1838;

import java.util.Arrays;

/**
 * sliding window
 */
class Boo implements Solution {

    @Override
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int n = nums.length, mx = 1;
        for (int l = 0, r = 0; r < n; r++) {
            sum += nums[r];
            for (; (r - l + 1L) * nums[r] > k + sum; l++) {
                sum -= nums[l];
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }

}
