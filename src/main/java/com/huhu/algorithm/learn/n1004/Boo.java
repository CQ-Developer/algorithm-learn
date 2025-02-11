package com.huhu.algorithm.learn.n1004;

/**
 * sliding window
 */
class Boo implements Solution {

    /**
     * 维护窗口最大值
     */
    @Override
    public int longestOnes(int[] nums, int k) {
        int l = 0, n = nums.length;
        for (int z = 0, r = 0; r < n; r++) {
            z += nums[r] ^ 1;
            if (z > k) {
                z -= nums[l] ^ 1;
                l++;
            }
        }
        return n - l;
    }

}
