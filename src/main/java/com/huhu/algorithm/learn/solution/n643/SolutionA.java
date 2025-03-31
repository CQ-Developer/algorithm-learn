package com.huhu.algorithm.learn.solution.n643;

/**
 * sliding window
 */
class SolutionA implements Solution {

    @Override
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int n = nums.length, mx = sum;
        for (int i = k; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            mx = Math.max(mx, sum);
        }
        return 1.0 * mx / k;
    }

}
