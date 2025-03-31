package com.huhu.algorithm.learn.solution.n825;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int numFriendRequests(int[] ages) {
        int[] cnt = new int[121];
        for (int age : ages) {
            cnt[age]++;
        }
        int res = 0;
        for (int w = 0, l = 0, r = 0; r < 121; r++) {
            w += cnt[r];
            for (; 2 * l <= r + 14; l++) {
                w -= cnt[l];
            }
            if (w > 0) {
                res += cnt[r] * (w - 1);
            }
        }
        return res;
    }

}
