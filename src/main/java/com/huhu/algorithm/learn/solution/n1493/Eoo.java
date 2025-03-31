package com.huhu.algorithm.learn.solution.n1493;

/**
 * <h1>dynamic programming</h1>
 */
class Eoo implements Solution {

    /**
     * 状态压缩
     *
     * @see Doo
     */
    @Override
    public int longestSubarray(int[] nums) {
        int f = 0, g = 0, mx = 0;
        for (int num : nums) {
            if (num == 1) {
                f++;
                g++;
            } else {
                f = g;
                g = 0;
            }
            mx = Math.max(mx, f);
        }
        return mx == nums.length ? mx - 1 : mx;
    }

}
