package com.huhu.algorithm.learn.n3134;

import java.util.HashMap;

/// # binary search & sliding window
class Aoo implements Solution {

    @Override
    public int medianOfUniquenessArray(int[] nums) {
        int n = nums.length;
        long k = (n * (n + 1L) / 2 + 1) / 2;
        int l = 0, r = n;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            if (check(nums, n, m, k)) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

    private boolean check(int[] nums, int n, int up, long k) {
        long cnt = 0;
        var freq = new HashMap<Integer, Integer>();
        for (int l = 0, r = 0; r < n; r++) {
            freq.merge(nums[r], 1, Integer::sum);
            for (; freq.size() > up; l++) {
                freq.computeIfPresent(nums[l], (_k, v) -> v == 1 ? null : v - 1);
            }
            cnt += r - l + 1;
            if (cnt >= k) {
                return true;
            }
        }
        return false;
    }

}
