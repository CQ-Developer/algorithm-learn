package com.huhu.algorithm.learn.solution.n2537;

import java.util.HashMap;
import java.util.Map;

/// # sliding window
class Aoo implements Solution {

    @Override
    public long countGood(int[] nums, int k) {
        long res = 0;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int pairs = 0, l = 0, r = 0; r < nums.length; r++) {
            pairs += counter.merge(nums[r], 1, Integer::sum) - 1;
            for (; pairs >= k; l++) {
                pairs -= counter.merge(nums[l], -1, Integer::sum);
            }
            res += l;
        }
        return res;
    }

}
