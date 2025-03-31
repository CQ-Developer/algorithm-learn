package com.huhu.algorithm.learn.solution.n2841;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * sliding window
 */
class SolutionA implements Solution {

    @Override
    public long maxSum(List<Integer> nums, int m, int k) {
        long sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int num = nums.get(i);
            sum += num;
            map.merge(num, 1, Integer::sum);
        }
        int n = nums.size();
        long res = map.size() >= m ? sum : 0;
        for (int i = k; i < n; i++) {
            int num = nums.get(i);
            int pre = nums.get(i - k);
            sum += num - pre;
            map.merge(num, 1, Integer::sum);
            map.computeIfPresent(pre, (_k, v) -> v == 1 ? null : v - 1);
            if (map.size() >= m) {
                res = Math.max(res, sum);
            }
        }
        return res;
    }

}
