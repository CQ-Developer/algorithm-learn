package com.huhu.algorithm.learn.solution.n1712;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int waysToSplit(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }
        int res = 0;
        for (int l = 1, m = 2, r = 2; l <= n - 1; l++) {
            m = Math.max(m, l + 1);
            r = Math.max(r, l + 1);
            // right >= mid
            while (r <= n - 1 && pre[n] - pre[r] >= pre[r] - pre[l]) {
                r++;
            }
            // mid >= left
            while (m <= n - 1 && pre[m] - pre[l] < pre[l]) {
                m++;
            }
            if (m <= r) {
                res = (res + r - m) % 1_000_000_007;
            }
        }
        return res;
    }

}
