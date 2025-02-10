package com.huhu.algorithm.learn.n1208;

/**
 * <h1>sliding window</h1>
 */
class Aoo implements Solution {

    /**
     * <p>使用{@code cost}记录{@code l...r}范围内使{@code s = t}的最大花费,
     * 显然需要{@code cost <= maxCost}, 子串的长度为{@code r - l + 1}.</p>
     *
     * <p>当{@code cost > maxCost}时, 收缩窗口左侧{@code l},
     * 使得窗口大小内{@code cost <= maxCost}.</p>
     */
    @Override
    public int equalSubstring(String s, String t, int maxCost) {
        char[] c1 = s.toCharArray(), c2 = t.toCharArray();
        int n = c1.length, mx = 0;
        for (int cost = 0, l = 0, r = 0; r < n; r++) {
            cost += Math.abs(c1[r] - c2[r]);
            for (; cost > maxCost; l++) {
                cost -= Math.abs(c1[l] - c2[l]);
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }

}
