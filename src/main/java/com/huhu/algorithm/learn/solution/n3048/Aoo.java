package com.huhu.algorithm.learn.solution.n3048;

import java.util.Arrays;

class Aoo implements Solution {

    @Override
    public int earliestSecondToMarkIndices(int[] nums, int[] changeIndices) {
        int n = nums.length, m = changeIndices.length;
        if (n > m) {
            return -1;
        }
        int[] lastT = new int[n];
        int l = n - 1, r = m + 1;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (check(nums, changeIndices, lastT, mid)) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r > m ? -1 : r;
    }

    private boolean check(int[] nums, int[] changeIndices, int[] lastT, int mx) {
        Arrays.fill(lastT, -1);
        for (int t = 0; t < mx; t++) {
            lastT[changeIndices[t] - 1] = t;
        }
        for (int t : lastT) {
            if (t < 0) {
                return false;
            }
        }
        int cnt = 0;
        for (int i = 0; i < mx; i++) {
            int j = changeIndices[i] - 1;
            if (i == lastT[j]) {
                if (nums[j] > cnt) {
                    return false;
                }
                cnt -= nums[j];
            } else {
                cnt++;
            }
        }
        return true;
    }

}
