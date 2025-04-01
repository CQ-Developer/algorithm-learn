package com.huhu.algorithm.learn.solution.n1712;

/**
 * binary search
 */
class Boo implements Solution {

    @Override
    public int waysToSplit(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }
        int res = 0;
        for (int r = 2; r < n && 3 * pre[r] <= 2 * pre[n]; r++) {
            int i = binarySearch(pre, 1, r, 2 * pre[r] - pre[n]);
            int j = binarySearch(pre, i, r, pre[r] / 2 + 1);
            res = (res + j - i) % 1000000007;
        }
        return res;
    }

    private int binarySearch(int[] pre, int l, int r, int tar) {
        while (l < r) {
            int m = (l + r) / 2;
            if (pre[m] >= tar) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

}
