package com.huhu.algorithm.learn.solution.n2958;

import java.util.HashMap;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int maxSubarrayLength(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        int mx = 0, n = nums.length;
        for (int l = 0, r = 0; r < n; r++) {
            int m = map.merge(nums[r], 1, Integer::sum);
            for (; m > k; l++) {
                map.merge(nums[l], -1, Integer::sum);
                if (nums[l] == nums[r]) {
                    m--;
                }
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }

}
