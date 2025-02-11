package com.huhu.algorithm.learn.n1658;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        x = sum - x;
        int n = nums.length, mx = -1;
        for (int s = 0, l = 0, r = 0; r < n; r++) {
            s += nums[r];
            for (; s > x && l <= r; l++) {
                s -= nums[l];
            }
            if (s == x) {
                mx = Math.max(mx, r - l + 1);
            }
        }
        return mx == -1 ? mx : n - mx;
    }

}
