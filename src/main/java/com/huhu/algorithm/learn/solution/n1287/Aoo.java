package com.huhu.algorithm.learn.solution.n1287;

import java.util.HashMap;
import java.util.Map;

class Aoo implements Solution {

    @Override
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int x : arr) {
            if (counter.merge(x, 1, Integer::sum) * 4 > arr.length) {
                return x;
            }
        }
        return -1;
    }

}
