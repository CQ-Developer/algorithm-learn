package com.huhu.algorithm.learn.solution.n2831;

import java.util.List;

///  # sliding window
class Boo implements Solution {

    /// 使用`maximums`记录每个数字出现的次数.
    ///
    /// 使用`mx`记录`l...r`范围内出现次数最多的数字.
    ///
    /// r - l + 1 表示 `l..r` 范围内数字的总量, 记为 `total`.
    ///
    /// 若 total - mx > k 则移动左边界, 缩小窗口.
    @Override
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int n = nums.size();
        int[] maximums = new int[n + 1];
        int mx = 0;
        for (int l = 0, r = 0; r < n; r++) {
            mx = Math.max(mx, ++maximums[nums.get(r)]);
            for (; r - l + 1 - mx > k; l++) {
                maximums[nums.get(l)]--;
            }
        }
        return mx;
    }

}
