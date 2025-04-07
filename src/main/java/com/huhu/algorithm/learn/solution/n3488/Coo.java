package com.huhu.algorithm.learn.solution.n3488;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * pre-process
 */
class Coo implements Solution {

    @Override
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        var pos = new HashMap<Integer, Integer>();
        int[] left = new int[n], right = new int[n];
        for (int i = -n; i < n; i++) {
            if (i >= 0) {
                int j = pos.get(nums[i]);
                left[i] = j;
                if (j >= 0) {
                    right[j] = i;
                } else {
                    right[j + n] = i + n;
                }
            }
            pos.put(nums[(i + n) % n], i);
        }

        var res = new ArrayList<Integer>();
        for (int query : queries) {
            int l = left[query];
            res.add(query - l == n ? -1 : Math.min(query - l, right[query] - query));
        }

        return res;
    }

}
