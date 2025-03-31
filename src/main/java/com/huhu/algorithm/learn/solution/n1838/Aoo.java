package com.huhu.algorithm.learn.solution.n1838;

import java.util.Arrays;

/**
 * sliding window
 */
class Aoo implements Solution {

    /**
     * 将问题转化为: 设 {@code max} 为 {@code l...r} 范围内最大值,
     * {@code sum} 为 {@code l...r} 范围内所有数字与 {@code max} 的差的绝对值的和,
     * 在 {@code sum <= k} 的情况下, 求 {@code l...r} 能表示的最大范围.
     */
    @Override
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, mx = 1;
        for (int sum = 0, l = n - 2, r = n - 1; l >= 0; l--) {
            sum += nums[r] - nums[l];
            for (; sum > k; r--) {
                sum = Math.max(0, sum - (r - l) * (nums[r] - nums[r - 1]));
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }

}
