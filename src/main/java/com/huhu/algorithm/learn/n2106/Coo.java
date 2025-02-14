package com.huhu.algorithm.learn.n2106;

/// # sliding window
class Coo implements Solution {

    @Override
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int l = findMostLeft(fruits, startPos - k), r = l;
        int sum = 0, n = fruits.length;
        for (; r < n && fruits[r][0] <= startPos; r++) {
            sum += fruits[r][1];
        }
        int res = sum;
        for (; r < n && fruits[r][0] <= startPos + k; r++) {
            sum += fruits[r][1];
            for (; fruits[r][0] - fruits[l][0] + Math.min(fruits[r][0] - startPos, startPos - fruits[l][0]) > k; l++) {
                sum -= fruits[l][1];
            }
            res = Math.max(res, sum);
        }
        return res;
    }

    /// ## 找到最能达到的最左侧位置
    private int findMostLeft(int[][] fruits, int target) {
        int l = -1, r = fruits.length;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            if (fruits[m][0] < target) {
                l = m;
            } else {
                r = m;
            }
        }
        return r;
    }

}
