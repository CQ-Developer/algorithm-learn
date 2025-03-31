package com.huhu.algorithm.learn.solution.n2779;

import java.util.Arrays;

/**
 * sliding window
 */
class Aoo implements Solution {

    /**
     * 实际上是求最长相交子数组.
     * 相交指的是{@code nums[l] + k >= nums[r] - k},
     * 即{@code nums[r] - nums[l] <= 2k}.
     */
    @Override
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, mx = 0;
        for (int l = 0, r = 0; r < n; r++) {
            while (nums[r] - nums[l] > k * 2) {
                l++;
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }

}
