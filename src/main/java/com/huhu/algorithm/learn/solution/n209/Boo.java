package com.huhu.algorithm.learn.solution.n209;

/// # sliding window
class Boo implements Solution {

    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int mn = Integer.MAX_VALUE;
        for (int s = 0, l = 0, r = 0; r < nums.length; r++) {
            s += nums[r];
            for (; s - nums[l] >= target; l++) {
                s -= nums[l];
            }
            if (s >= target) {
                mn = Math.min(mn, r - l + 1);
            }
        }
        return mn == Integer.MAX_VALUE ? 0 : mn;
    }

}
