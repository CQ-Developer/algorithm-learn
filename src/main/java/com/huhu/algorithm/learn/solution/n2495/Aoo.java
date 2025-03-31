package com.huhu.algorithm.learn.solution.n2495;

/// # sliding window
class Aoo implements Solution {

    @Override
    public long evenProduct(int[] nums) {
        long res = 0;
        for (int l = -1, r = 0; r < nums.length; r++) {
            if ((nums[r] & 1) == 0) {
                l = r;
            }
            res += l + 1;
        }
        return res;
    }

}
