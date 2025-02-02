package com.huhu.algorithm.learn.n1852;

import java.util.HashMap;
import java.util.Map;

class Aoo implements Solution {

    @Override
    public int[] distinctNumbers(int[] nums, int k) {
        Map<Integer, Integer> win = new HashMap<>();
        for (int i = 0; i < k; i++) {
            win.merge(nums[i], 1, Integer::sum);
        }
        int n = nums.length;
        int[] res = new int[n - k + 1];
        res[0] = win.size();
        for (int i = k; i < n; i++) {
            win.merge(nums[i], 1, Integer::sum);
            win.computeIfPresent(nums[i - k], (e, v) -> v == 1 ? null : v - 1);
            res[i - k + 1] = win.size();
        }
        return res;
    }

}
