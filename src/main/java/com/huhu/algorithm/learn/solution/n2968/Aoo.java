package com.huhu.algorithm.learn.solution.n2968;

import java.util.Arrays;

class Aoo implements Solution {

    @Override
    public int maxFrequencyScore(int[] nums, long k) {
        Arrays.sort(nums);
        int n = nums.length;
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }
        int res = 0;
        for (int l = 0, r = 0; r < n; r++) {
            while (distance(nums, pre, l, r, (l + r) / 2) > k) {
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    private long distance(int[] nums, long[] pre, int l, int r, int i) {
        long left = (long) nums[i] * (i - l) - (pre[i] - pre[l]);
        long right = pre[r + 1] - pre[i + 1] - (long) nums[i] * (r - i);
        return left + right;
    }

}
