package com.huhu.algorithm.learn.n2461;

import java.util.HashMap;
import java.util.Map;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.merge(nums[i], 1, Integer::sum);
        }
        long res = map.size() == k ? sum : 0;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            map.merge(nums[i], 1, Integer::sum);
            map.computeIfPresent(nums[i - k], (e, v) -> v == 1 ? null : v - 1);
            res = map.size() == k ? Math.max(res, sum) : res;
        }
        return res;
    }

}
