package com.huhu.algorithm.learn.n3413;

import java.util.Arrays;

/// # sliding window
class Aoo implements Solution {

    @Override
    public long maximumCoins(int[][] coins, int k) {
        Arrays.sort(coins, (a, b) -> a[0] - b[0]);
        long mx = sliding(coins, k);
        // reverse coins and make [l,r,v] to [-r,-l,v]
        for (int l = 0, r = coins.length - 1; l < r; l++, r--) {
            int[] coin = coins[l];
            coins[l] = coins[r];
            coins[r] = coin;
        }
        for (int[] coin : coins) {
            int c = coin[0];
            coin[0] = -coin[1];
            coin[1] = -c;
        }
        return Math.max(mx, sliding(coins, k));
    }

    private long sliding(int[][] coins, int k) {
        long res = 0, covered = 0;
        for (int j = 0, i = 0; i < coins.length; i++) {
            covered += (long) (coins[i][1] - coins[i][0] + 1) * coins[i][2];
            for (; coins[j][1] + k - 1 < coins[i][1]; j++) {
                covered -= (long) (coins[j][1] - coins[j][0] + 1) * coins[j][2];
            }
            long uncovered = Math.max(0, (long) (coins[i][1] - k + 1 - coins[j][0]) * coins[j][2]);
            res = Math.max(res, covered - uncovered);
        }
        return res;
    }

}
