package com.huhu.algorithm.learn.n2799;

import java.util.Arrays;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int countCompleteSubarray(int[] nums) {
        int dif = 0;
        int[] cnt = new int[2001];
        for (int i : nums) {
            if (cnt[i]++ == 0) {
                dif++;
            }
        }
        Arrays.fill(cnt, 0);
        int res = 0, n = nums.length;
        for (int cur = 0, l = 0, r = 0; r < n; r++) {
            if (cnt[nums[r]]++ == 0) {
                cur++;
            }
            for (; cur == dif; l++) {
                if (--cnt[nums[l]] == 0) {
                    cur--;
                }
            }
            res += l;
        }
        return res;
    }

}
