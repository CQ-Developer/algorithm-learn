package com.huhu.algorithm.learn.solution.n487;

/// # dynamic programming
class Coo implements Solution {

    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, f = 0, g = 0;
        for (int num : nums) {
            if (num == 1) {
                f++;
            } else {
                g = f + 1;
                f = 0;
            }
            res = Math.max(res, f + g);
        }
        return res;
    }

}
