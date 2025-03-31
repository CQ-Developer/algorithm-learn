package com.huhu.algorithm.learn.solution.n2009;

import java.util.Arrays;

/// # sliding window
class Aoo implements Solution {

    /// ## 核心思路
    ///
    /// > 反向思考: 要求使数组连续的最少操作数, 即考虑能够最多保留多少个数不需要进行操作.
    ///
    /// 1. 题目要求连续数组中不能存在重复元素, 那么无论如何重复的元素最终都要被替换掉,
    /// 所以可以对数组进行去重, 这样在求最多保留多少个数时就无需考虑重复问题了.
    /// 2. 题目要求最终整个数组都是连续数组, 那么其顺序并不影响结果.
    ///
    /// 假设排序去重后的数组为arr, 在`l...r`范围内, 其最大值为`arr[r]`, 最小值为`arr[l]`,
    /// 要求在满足`arr[r] - arr[l] == n - 1`的情况下, 求最大窗口大小.
    @Override
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, m = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[m++] = nums[i];
            }
        }
        int mx = 0;
        for (int l = 0, r = 0; r < m; r++) {
            while (nums[l] < nums[r] - n + 1) {
                l++;
            }
            mx = Math.max(mx, r - l + 1);
        }
        return n - mx;
    }

}
