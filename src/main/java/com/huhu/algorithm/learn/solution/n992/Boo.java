package com.huhu.algorithm.learn.solution.n992;

/**
 * sliding window
 */
class Boo implements Solution {

    @Override
    public int subarraysWithKDistinct(int[] nums, int k) {
        int res = 0, n = nums.length;
        int[] cnt1 = new int[n + 1], cnt2 = new int[n + 1];
        for (int dst1 = 0, dst2 = 0, l1 = 0, l2 = 0, r = 0; r < n; r++) {
            if (cnt1[nums[r]]++ == 0) {
                dst1++;
            }
            for (; dst1 >= k; l1++) {
                if (--cnt1[nums[l1]] == 0) {
                    dst1--;
                }
            }
            if (cnt2[nums[r]]++ == 0) {
                dst2++;
            }
            for (; dst2 > k; l2++) {
                if (--cnt2[nums[l2]] == 0) {
                    dst2--;
                }
            }
            res += l1 - l2;
        }
        return res;
    }

}
