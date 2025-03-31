package com.huhu.algorithm.learn.solution.n2831;

import java.util.ArrayList;
import java.util.List;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int n = nums.size();
        var list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            list.get(nums.get(i)).add(i);
        }
        int res = 0;
        for (List<Integer> range : list) {
            for (int l = 0, r = 0; r < range.size(); r++) {
                // range[r] - range[l] + 1 表示x所在的某个范围内总共有多少个元素
                // r - l + 1 表示有多少个x元素
                // (range[r] - range[l] + 1) - (r - l + 1) 表示去除x元素后, 剩余元素的数量, 不能大于k
                // 简化为 range[r] - dix[l] - r + l > k
                while (range.get(r) - range.get(l) - r + l > k) {
                    l++;
                }
                res = Math.max(res, r - l + 1);
            }
        }
        return res;
    }

}
