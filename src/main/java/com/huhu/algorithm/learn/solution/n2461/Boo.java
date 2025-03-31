package com.huhu.algorithm.learn.solution.n2461;

import java.util.HashMap;
import java.util.Map;

/**
 * sliding window
 */
class Boo implements Solution {

    @Override
    public long maximumSubarraySum(int[] nums, int k) {
        long res = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.merge(nums[i], 1, Integer::sum);
            if (i < k - 1) {
                continue;
            }
            res = map.size() == k ? Math.max(res, sum) : res;
            sum -= nums[i - k + 1];
            map.computeIfPresent(nums[i - k + 1], (e, v) -> v == 1 ? null : v - 1);
        }
        return res;
    }

}
