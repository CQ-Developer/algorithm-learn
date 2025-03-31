package com.huhu.algorithm.learn.solution.n220;

import java.util.ArrayList;
import java.util.Collections;

/**
 * AC
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int n = nums.length;
        var list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int j = Collections.binarySearch(list, num);
            if (j < 0) {
                j = -j - 1;
            }
            list.add(j, num);
            if (j > 0 && num - list.get(j - 1) <= valueDiff) {
                return true;
            }
            if (j + 1 < list.size() && list.get(j + 1) - num <= valueDiff) {
                return true;
            }
            if (i < indexDiff) {
                continue;
            }
            list.remove(Collections.binarySearch(list, nums[i - indexDiff]));
        }
        return false;
    }

}
