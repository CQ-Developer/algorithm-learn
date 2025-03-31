package com.huhu.algorithm.learn.solution.n220;

import java.util.TreeSet;

/**
 * AC
 * sliding window
 */
class Boo implements Solution {

    @Override
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int n = nums.length;
        var tree = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            int v = nums[i];
            Integer u = tree.floor(v);
            if (u != null && v - u <= valueDiff) {
                return true;
            }
            u = tree.ceiling(v);
            if (u != null && u - v <= valueDiff) {
                return true;
            }
            tree.add(v);
            if (i < indexDiff) {
                continue;
            }
            tree.remove(nums[i - indexDiff]);
        }
        return false;
    }

}
