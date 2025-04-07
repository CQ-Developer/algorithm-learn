package com.huhu.algorithm.learn.solution.n3488;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * pre-process
 */
class Doo implements Solution {

    @Override
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        Map<Integer, Integer> first = new HashMap<>(), last = new HashMap<>();
        int[] left = new int[n], right = new int[n];

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            left[i] = last.getOrDefault(x, -1);
            if (left[i] >= 0) {
                right[left[i]] = i;
            }
            first.putIfAbsent(x, i);
            last.put(x, i);
        }

        var res = new ArrayList<Integer>();
        for (int i : queries) {
            int l = left[i] >= 0 ? left[i] : last.get(nums[i]) - n;
            if (i - l == n) {
                res.add(-1);
            } else {
                int r = right[i] > 0 ? right[i] : first.get(nums[i]) + n;
                res.add(Math.min(i - l, r - i));
            }
        }

        return res;
    }

}
