package com.huhu.algorithm.learn.n904;

import java.util.HashMap;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int totalFruit(int[] fruits) {
        int n = fruits.length, mx = 0;
        var map = new HashMap<Integer, Integer>();
        for (int l = 0, r = 0; r < n; r++) {
            map.merge(fruits[r], 1, Integer::sum);
            for (; map.size() > 2; l++) {
                map.computeIfPresent(fruits[l], (k, v) -> v == 1 ? null : v - 1);
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }

}
