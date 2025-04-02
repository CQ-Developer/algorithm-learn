package com.huhu.algorithm.learn.solution.n35;

/**
 * binary search
 */
class Coo implements Solution {

    /**
     * open interval
     */
    @Override
    public int searchInsert(int[] nums, int target) {
        int l = -1, r = nums.length;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (nums[i] >= target) {
                r = i;
            } else {
                l = i;
            }
        }
        return r;
    }

}
