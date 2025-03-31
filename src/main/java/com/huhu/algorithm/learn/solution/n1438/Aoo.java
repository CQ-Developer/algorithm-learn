package com.huhu.algorithm.learn.solution.n1438;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int longestSubarray(int[] nums, int limit) {
        int res = 0, n = nums.length;
        SortedMap<Integer, Integer> tree = new TreeMap<>();
        for (int l = 0, r = 0; r < n; r++) {
            tree.merge(nums[r], 1, Integer::sum);
            for (; tree.lastKey() - tree.firstKey() > limit; l++) {
                tree.computeIfPresent(nums[l], (k, v) -> v == 1 ? null : v - 1);
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}
