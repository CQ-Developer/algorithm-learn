package com.huhu.algorithm.learn.n1208;

/**
 * <h1>sliding window</h1>
 */
class Coo implements Solution {

    /**
     * <p>始终维持找到的最大窗口{@code l...r}.
     * 当窗口内{@code sum > maxCost}时, 将整个窗口平移.</p>
     *
     * <p>大体与 {@link Aoo}思路相同, 只是通过维持最大窗口的思路,
     * 去掉了内存循环.</p>
     */
    @Override
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int l = 0, r = 0;
        for (int sum = 0, i = 0; i < n; i++) {
            sum += cost[i];
            if (sum > maxCost) {
                sum -= cost[l];
                l++;
            }
            r++;
        }
        return r - l;
    }

}
