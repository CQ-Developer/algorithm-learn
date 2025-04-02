package com.huhu.algorithm.learn.solution.n35;

/**
 * sliding window
 */
class Boo implements Solution {

    /**
     * left-closed right-open interval
     */
    @Override
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int i = l + (r - l) / 2;
            if (nums[i] >= target) {
                r = i;
            } else {
                l = i + 1;
            }
        }
        return r;
    }

}
