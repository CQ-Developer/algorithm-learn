package com.huhu.algorithm.learn.solution.n1004;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int longestOnes(int[] nums, int k) {
        int n = nums.length, mx = 0;
        for (int z = 0, l = 0, r = 0; r < n; r++) {
            z += nums[r] ^ 1;
            for (; z > k; l++) {
                z -= nums[l] ^ 1;
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }

}
