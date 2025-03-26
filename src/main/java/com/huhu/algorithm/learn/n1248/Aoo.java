package com.huhu.algorithm.learn.n1248;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0, n = nums.length;
        for (int s1 = 0, s2 = 0, l1 = 0, l2 = 0, r = 0; r < n; r++) {
            if ((nums[r] & 1) == 1) {
                s1++;
                s2++;
            }
            for (; l1 <= r && s1 >= k; l1++) {
                if ((nums[l1] & 1) == 1) {
                    s1--;
                }
            }
            for (; l2 <= r && s2 >= k + 1; l2++) {
                if ((nums[l2] & 1) == 1) {
                    s2--;
                }
            }
            res += l1 - l2;
        }
        return res;
    }

}
