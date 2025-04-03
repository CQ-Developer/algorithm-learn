package com.huhu.algorithm.learn.solution.n1385;

import java.util.Arrays;

/**
 * binary search
 */
class Aoo implements Solution {

    /// 要求不存在`abs(arr1[i] - arr2[j]) <= d`, 则答案`+1`.
    ///
    /// 1. 相当于:
    ///     - `arr1[i] - arr2[j] <= d`
    ///     - `arr1[i] - arr2[j] >= -d`
    ///
    /// 2. 合并条件:
    ///
    ///     当 `arr2[j]`不存在于`[arr1[i] - d, arr1[i] + d]`范围内时, 答案`+1`
    @Override
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int res = 0;
        for (int x : arr1) {
            int i = search(arr2, x - d);
            if (i == arr2.length || arr2[i] > x + d) {
                res++;
            }
        }
        return res;
    }

    /**
     * (l...r)
     */
    private int search(int[] nums, int tar) {
        int l = -1, r = nums.length;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (nums[i] >= tar) {
                r = i;
            } else {
                l = i;
            }
        }
        return r;
    }

}
