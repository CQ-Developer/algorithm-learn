package com.huhu.algorithm.learn.solution.n1818;

import java.util.Arrays;

class Aoo implements Solution {

    private static final int M = 0x3b9aca07;

    @Override
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length, sum = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = nums1[i];
            sum = (sum + (Math.abs(nums1[i] - nums2[i]))) % M;
        }
        Arrays.sort(nums);
        int mx = 0;
        for (int i = 0; i < n; i++) {
            int dif = Integer.MAX_VALUE;
            int j = search(nums, nums2[i]);
            if (j < n) {
                dif = Math.min(dif, Math.abs(nums[j] - nums2[i]));
            }
            if (j > 0) {
                dif = Math.min(dif, Math.abs(nums[j - 1] - nums2[i]));
            }
            mx = Math.max(mx, Math.abs(nums1[i] - nums2[i]) - dif);
        }
        return (sum - mx + M) % M;
    }

    /**
     * binary search (l...r)
     */
    private int search(int[] nums, int target) {
        int l = -1, r = nums.length;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            // nums[l] <  target
            // nums[r] >= target
            if (nums[m] >= target) {
                r = m;
            } else {
                l = m;
            }
        }
        // l + 1 == r
        return r;
    }

}
