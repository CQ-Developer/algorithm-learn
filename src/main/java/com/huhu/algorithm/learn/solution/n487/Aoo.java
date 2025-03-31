package com.huhu.algorithm.learn.solution.n487;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        for (int f = 0, l = 0, r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                f++;
            }
            for (; f > 1; l++) {
                if (nums[l] == 0) {
                    f--;
                }
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}
