package com.huhu.algorithm.learn.solution.n1182;

import java.util.ArrayList;
import java.util.List;

/**
 * pre process
 */
class Aoo implements Solution {

    @Override
    public List<Integer> shortestDistanceColor(int[] colors, int[][] queries) {
        int n = colors.length, inf = 1 << 30;
        int[][] right = new int[n + 1][3];
        right[n][0] = right[n][1] = right[n][2] = inf;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                right[i][j] = right[i + 1][j];
            }
            right[i][colors[i] - 1] = i;
        }
        int[][] left = new int[n + 1][3];
        left[0][0] = left[0][1] = left[0][2] = -inf;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                left[i + 1][j] = left[i][j];
            }
            left[i + 1][colors[i] - 1] = i;
        }
        List<Integer> res = new ArrayList<>();
        for (int[] q : queries) {
            int i = q[0], c = q[1] - 1;
            int distance = Math.min(i - left[i + 1][c], right[i][c] - i);
            res.add(distance > n ? -1 : distance);
        }
        return res;
    }

}
