package com.huhu.algorithm.learn.n2106;

/// # sliding window
class Aoo implements Solution {

    /// ## 核心思路
    ///
    /// 假设在`l...r`区间内求最小步数:
    /// 1. 若`l <= r <= startPos`, 最小步数为`startPos - l`.
    /// 2. 若`startPos <= l <= r`, 最小步数为`r - startPos`.
    /// 3. 若`l < startPos < r`:
    ///     - 先右后左, 最小步数为`r - l + (r - startPos)`.
    ///     - 先左后右, 最小步数为`r - l + (startPos - l)`.
    ///
    /// 综合以上三种情况:
    /// - 对于情况1, 可以转换为`r - l + |r - startPos|`,
    /// - 对于情况2, 可以转换为`r - l + |startPos - l|`.
    ///
    /// 则在`l...r`区间内的最小步数为:
    /// > `r - l + min(|r - startPos|, |startPos - l|)`
    @Override
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length, mx = 0;
        for (int sum = 0, l = 0, r = 0; r < n; r++) {
            sum += fruits[r][1];
            for (int right = fruits[r][0]; l <= r && right - fruits[l][0] + Math.min(Math.abs(right - startPos), Math.abs(startPos - fruits[l][0])) > k; l++) {
                sum -= fruits[l][1];
            }
            mx = Math.max(mx, sum);
        }
        return mx;
    }

}
