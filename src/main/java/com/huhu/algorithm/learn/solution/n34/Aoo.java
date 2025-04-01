package com.huhu.algorithm.learn.solution.n34;

/**
 * binary search
 */
class Aoo implements Solution {

    @Override
    public int[] searchRange(int[] nums, int target) {
        int i = search(nums, target);
        if (i == nums.length || nums[i] != target) {
            return new int[]{-1, -1};
        }
        // 查找 >= target + 1 的最左侧位置 x
        // target 的最右侧位置既 x - 1
        int j = search(nums, target + 1) - 1;
        return new int[]{i, j};
    }

    /**
     * 闭区间
     * 查找 >= target 的最左侧位置
     */
    private int search(int[] nums, int tar) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] < tar) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        // r + 1 == l
        return l;
    }

}
