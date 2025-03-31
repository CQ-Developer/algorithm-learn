package com.huhu.algorithm.learn.solution.n1208;

/**
 * <h1>sliding window</h1>
 */
class Boo implements Solution {

    /**
     * <p>和{@link Aoo}的算法相同, 只是提前计算了每个位置的cost.
     * 防止重复计算.</p>
     */
    @Override
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] costs = new int[n];
        for (int i = 0; i < n; i++) {
            costs[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int mx = 0;
        for (int sum = 0, l = 0, r = 0; r < n; r++) {
            sum += costs[r];
            for (; sum > maxCost; l++) {
                sum -= costs[l];
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }

}
