package com.huhu.algorithm.learn.solution.n1438;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * sliding window & sorted list
 */
class Coo implements Solution {

    @Override
    public int longestSubarray(int[] nums, int limit) {
        int res = 0, n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int l = 0, r = 0; r < n; r++) {
            add(list, nums[r]);
            for (; list.getLast() - list.getFirst() > limit; l++) {
                del(list, nums[l]);
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    private void add(List<Integer> list, int num) {
        int i = Collections.binarySearch(list, num);
        if (i < 0) {
            i = -i - 1;
        }
        list.add(i, num);
    }

    private void del(List<Integer> list, int num) {
        int i = Collections.binarySearch(list, num);
        if (i < 0) {
            i = -i - 1;
        }
        list.remove(i);
    }

}
