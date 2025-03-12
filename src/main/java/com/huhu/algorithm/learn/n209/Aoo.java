package com.huhu.algorithm.learn.n209;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int mn = Integer.MAX_VALUE;
        for (int s = 0, l = 0, r = 0; r < nums.length; r++) {
            s += nums[r];
            for (; s >= target; l++) {
                mn = Math.min(mn, r - l + 1);
                s -= nums[l];
            }
        }
        return mn == Integer.MAX_VALUE ? 0 : mn;
    }

}
