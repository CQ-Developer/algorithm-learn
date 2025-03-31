package com.huhu.algorithm.learn.solution.n1493;

/**
 * <h1>dynamic programming</h1>
 */
class Doo implements Solution {

    @Override
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        // f[i]表示以第i位结尾, 并且可以删除一个0, 最长连续全1子数组的长度
        // g[i]表示以第i位结尾, 最长连续全1子数组的长度
        int[] f = new int[n + 1], g = new int[n + 1];
        int mx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                f[i + 1] = f[i] + 1;
                g[i + 1] = g[i] + 1;
            } else {
                f[i + 1] = g[i];
                g[i + 1] = 0;
            }
            mx = Math.max(mx, f[i + 1]);
        }
        return mx == n ? mx - 1 : mx;
    }

}
