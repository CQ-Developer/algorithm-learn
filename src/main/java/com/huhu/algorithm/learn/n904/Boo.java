package com.huhu.algorithm.learn.n904;

import java.util.HashMap;

/**
 * sliding window
 */
class Boo implements Solution {

    @Override
    public int totalFruit(int[] fruits) {
        int l = 0, n = fruits.length;
        var map = new HashMap<Integer, Integer>();
        for (int fruit : fruits) {
            map.merge(fruit, 1, Integer::sum);
            if (map.size() > 2) {
                map.computeIfPresent(fruits[l], (k, v) -> v == 1 ? null : v - 1);
                l++;
            }
        }
        return n - l;
    }

}
