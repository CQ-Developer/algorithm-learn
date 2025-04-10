package com.huhu.algorithm.learn.lcp.n8;

class Aoo implements Solution {

    @Override
    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
        int n = increase.length;
        int[][] inc = new int[n + 1][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                inc[i + 1][j] = inc[i][j] + increase[i][j];
            }
        }
        int m = requirements.length;
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int l = -1, r = n + 1;
            while (l + 1 < r) {
                int j = l + (r - l) / 2;
                if (inc[j][0] >= requirements[i][0] &&
                    inc[j][1] >= requirements[i][1] &&
                    inc[j][2] >= requirements[i][2]) {
                    r = j;
                } else {
                    l = j;
                }
            }
            res[i] = r <= n ? r : -1;
        }
        return res;
    }

}
