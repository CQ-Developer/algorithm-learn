package com.huhu.algorithm.learn.n1040;

import java.util.Arrays;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int[] numMovesStonesII(int[] stones) {
        Arrays.sort(stones);
        int n = stones.length;
        int p = stones[n - 1] - stones[1] - n + 2;
        int q = stones[n - 2] - stones[0] - n + 2;
        int mx = Math.max(p, q);
        if (p == 0 || q == 0) {
            return new int[]{Math.min(2, mx), mx};
        }
        // 计算大小为n的窗口内最多的石子数
        int mxCnt = 0;
        for (int l = 0, r = 0; r < n; r++) {
            while (stones[r] - stones[l] + 1 > n) {
                l++;
            }
            mxCnt = Math.max(mxCnt, r - l + 1);
        }
        return new int[]{n - mxCnt, mx};
    }

}
