package com.huhu.algorithm.learn.solution.n1818;

import java.util.Arrays;

class Boo implements Solution {

    private static final int M = 0x3b9aca07;

    @Override
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] sorted = Arrays.copyOf(nums1, n);
        Arrays.sort(sorted);
        int sum = 0, max = 0;
        for (int i = 0; i < n; i++) {
            int a = nums1[i], b = nums2[i];
            if (a != b) {
                int x = Math.abs(a - b);
                sum = (sum + x) % M;
                int j = search(sorted, b);
                int dif = Math.abs(sorted[j] - b);
                if (j + 1 < n) {
                    dif = Math.min(dif, Math.abs(sorted[j + 1] - b));
                }
                if (dif < x) {
                    max = Math.max(max, x - dif);
                }
            }
        }
        return (sum - max + M) % M;
    }

    /**
     * [l...r] binary search: maximum <= target
     */
    private static int search(int[] sorted, int target) {
        int l = 0, r = sorted.length - 1;
        while (l < r) {
            int m = l + (r - l + 1) / 2;
            if (sorted[m] <= target) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

}
