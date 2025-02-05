package com.huhu.algorithm.learn.n2653;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * sliding window - AC
 */
class Aoo implements Solution {

    @Override
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        List<Integer> window = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            window.add(nums[i]);
        }
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Collections.sort(window);
        res[0] = Math.min(window.get(x - 1), 0);
        for (int i = k; i < n; i++) {
            int j = Collections.binarySearch(window, nums[i]);
            window.add(j < 0 ? -j - 1 : j, nums[i]);
            window.remove(Collections.binarySearch(window, nums[i - k]));
            res[i - k + 1] = Math.min(window.get(x - 1), 0);
        }
        return res;
    }

}
