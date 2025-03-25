package com.huhu.algorithm.learn.n930;

import java.util.HashMap;

/**
 * prefix sum & hash table
 */
class Coo implements Solution {

    @Override
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        var map = new HashMap<Integer, Integer>();
        map.put(0, 1);
        int res = 0;
        for (int i = 0; i < n; i++) {
            int cur = sum[i + 1], pre = cur - goal;
            res += map.getOrDefault(pre, 0);
            map.merge(cur, 1, Integer::sum);
        }
        return res;
    }

}
