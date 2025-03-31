package com.huhu.algorithm.learn.solution.n1493;

/**
 * <h1>dynamic programming</h1>
 */
class Coo implements Solution {

    @Override
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        // 以i结尾的最长连续1的长度
        int[] pre = new int[n];
        pre[0] = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == 1) {
                pre[i] = pre[i - 1] + 1;
            }
        }
        // 以i开头的最长连续1的长度
        int[] suf = new int[n];
        suf[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] == 1) {
                suf[i] = suf[i + 1] + 1;
            }
        }
        // 动态规划
        int mx = 0;
        for (int i = 0; i < n; i++) {
            int preSum = i == 0 ? 0 : pre[i - 1];
            int sufSum = i == n - 1 ? 0 : suf[i + 1];
            mx = Math.max(mx, preSum + sufSum);
        }
        return mx;
    }

}
