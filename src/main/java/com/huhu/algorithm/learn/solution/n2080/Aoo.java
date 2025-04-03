package com.huhu.algorithm.learn.solution.n2080;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Aoo implements RangeFreqQuery {

    private final Map<Integer, List<Integer>> index = new HashMap<>();

    public Aoo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!index.containsKey(arr[i])) {
                index.put(arr[i], new ArrayList<>());
            }
            index.get(arr[i]).add(i);
        }
    }

    @Override
    public int query(int left, int right, int value) {
        List<Integer> nums = index.get(value);
        if (nums == null) {
            return 0;
        }
        return search(nums, right + 1) - search(nums, left);
    }

    /**
     * binary search
     */
    private int search(List<Integer> nums, int target) {
        int l = -1, r = nums.size();
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (nums.get(i) >= target) {
                r = i;
            } else {
                l = i;
            }
        }
        return r;
    }

}
