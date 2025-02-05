package com.huhu.algorithm.learn.n2134;

/**
 * sliding window - AC
 */
class Aoo implements Solution {

    @Override
    public int minSwaps(int[] nums) {
        int k = 0;
        for (int num : nums) {
            k += num;
        }
        int cnt = 0;
        for (int i = 0; i < k; i++) {
            cnt += nums[i];
        }
        int n = nums.length, res = cnt;
        for (int i = 0; i < n - 1; i++) {
            // i           leave the window
            // (i + k) % n enter the window
            cnt += nums[(i + k) % n] - nums[i];
            res = Math.max(res, cnt);
        }
        return k - res;
    }

}
