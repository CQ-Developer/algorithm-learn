package com.huhu.algorithm.learn.n2107;

import java.util.HashMap;
import java.util.Map;

/**
 * sliding window - AC
 */
class Aoo implements Solution {

    @Override
    public int shareCandies(int[] candies, int k) {
        Map<Integer, Integer> window = new HashMap<>();
        int n = candies.length;
        for (int i = k; i < n; i++) {
            window.merge(candies[i], 1, Integer::sum);
        }
        int res = window.size();
        for (int i = k; i < n; i++) {
            window.merge(candies[i - k], 1, Integer::sum);
            window.computeIfPresent(candies[i], (e, v) -> v == 1 ? null : v - 1);
            res = Math.max(res, window.size());
        }
        return res;
    }

}
