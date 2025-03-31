package com.huhu.algorithm.learn.solution.n3411;

/// # brute force
class Aoo implements Solution {

    @Override
    public int maxLength(int[] nums) {
        int res = 0, n = nums.length;
        // 穷举每个子数组
        for (int i = 0; i < n; i++) {
            // 使用long防止溢出
            long pro = 1, lcm = 1, gcd = 0;
            for (int j = i; j < n; j++) {
                pro *= nums[j];
                lcm = lcm(lcm, nums[j]);
                gcd = gcd(gcd, nums[j]);
                if (pro == lcm * gcd) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

}
