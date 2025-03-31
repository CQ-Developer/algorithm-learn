package com.huhu.algorithm.learn.solution.n2831;

import java.util.List;

/// # sliding window
class Coo implements Solution {

    /// 移除内部循环, 改成维持最大窗口
    ///
    /// @see Boo
    @Override
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int n = nums.size();
        int[] maximums = new int[n + 1];
        int mx = 0;
        for (int l = 0, r = 0; r < n; r++) {
            mx = Math.max(mx, ++maximums[nums.get(r)]);
            if (r - l + 1 - mx > k) {
                maximums[nums.get(l++)]--;
            }
        }
        return mx;
    }

}
