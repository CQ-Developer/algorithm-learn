package com.huhu.algorithm.learn.n2762;

import java.util.TreeMap;

/// # sliding window
class Aoo implements Solution {

    @Override
    public long continuousSubarrays(int[] nums) {
        long res = 0;
        var tree = new TreeMap<Integer, Integer>();
        for (int l = 0, r = 0; r < nums.length; r++) {
            tree.merge(nums[r], 1, Integer::sum);
            for (; tree.lastKey() - tree.firstKey() > 2; l++) {
                tree.computeIfPresent(nums[l], (k, v) -> v == 1 ? null : v - 1);
            }
            res += r - l + 1;
        }
        return res;
    }

}
