package com.huhu.algorithm.learn.solution.n1283;

class Aoo implements Solution {

    @Override
    public int smallestDivisor(int[] nums, int threshold) {
        int r = 0;
        for (int num : nums) {
            r = Math.max(r, num);
        }
        int l = 1;
        while (l <= r) {
            int d = l + (r - l) / 2;
            if (check(nums, d, threshold)) {
                r = d - 1;
            } else {
                l = d + 1;
            }
        }
        return l;
    }

    private boolean check(int[] nums, int d, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + d - 1) / d;
            if (sum > threshold) {
                return false;
            }
        }
        return true;
    }

}
