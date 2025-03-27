package com.huhu.algorithm.learn.n992;

import java.util.HashMap;
import java.util.Map;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int subarraysWithKDistinct(int[] nums, int k) {
        int res = 0, n = nums.length;
        Map<Integer, Integer> cnt1 = new HashMap<>(), cnt2 = new HashMap<>();
        for (int l1 = 0, l2 = 0, r = 0; r < n; r++) {
            cnt1.merge(nums[r], 1, Integer::sum);
            for (; cnt1.size() >= k; l1++) {
                cnt1.computeIfPresent(nums[l1], (_k, v) -> v == 1 ? null : v - 1);
            }
            cnt2.merge(nums[r], 1, Integer::sum);
            for (; cnt2.size() > k; l2++) {
                cnt2.computeIfPresent(nums[l2], (_k, v) -> v == 1 ? null : v - 1);
            }
            res += l1 - l2;
        }
        return res;
    }

}
