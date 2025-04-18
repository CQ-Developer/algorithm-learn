package com.huhu.algorithm.learn.solution.n2702;

class Aoo implements Solution {

    @Override
    public int minOperations(int[] nums, int x, int y) {
        int mx = nums[0];
        for (int num : nums) {
            mx = Math.max(mx, num);
        }
        int l = 0, r = (mx - 1) / y + 2;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (check(nums, x, y, m)) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

    private boolean check(int[] nums, int x, long y, int ops) {
        long cnt = 0;
        for (int v : nums) {
            if (v > ops * y) {
                cnt += (v - ops * y - 1) / (x - y) + 1;
            }
        }
        return cnt <= ops;
    }

}
