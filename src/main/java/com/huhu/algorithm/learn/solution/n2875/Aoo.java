package com.huhu.algorithm.learn.solution.n2875;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int minSizeSubarray(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length, res = Integer.MAX_VALUE;
        for (int s = 0, l = 0, r = 0; r < n * 2; r++) {
            s += nums[r % n];
            for (; s - nums[l % n] >= target % sum; l++) {
                s -= nums[l % n];
            }
            if (s == target % sum) {
                res = Math.min(res, r - l + 1);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res + (target / sum) * n;
    }

}