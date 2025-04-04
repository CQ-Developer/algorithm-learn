package com.huhu.algorithm.learn.solution.n35;

/**
 * binary searching
 */
class Aoo implements Solution {

    /**
     * closed interval
     */
    @Override
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

}
