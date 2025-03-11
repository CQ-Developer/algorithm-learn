package com.huhu.algorithm.learn.n487;

/// # dynamic programming
class Boo implements Solution {

    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, res = 0;
        int[] f = new int[n + 1], g = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                f[i + 1] = f[i] + 1;
                g[i + 1] = g[i];
            } else {
                g[i + 1] = f[i] + 1;
                f[i + 1] = 0;
            }
            res = Math.max(res, f[i + 1] + g[i + 1]);
        }
        return res;
    }

}
