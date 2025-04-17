package com.huhu.algorithm.learn.solution.n2604;

import java.util.Arrays;

class Aoo implements Solution {

    @Override
    public int minimumTime(int[] hens, int[] grains) {
        Arrays.sort(hens);
        Arrays.sort(grains);
        int n = grains.length;
        int l = 0, r = Math.abs(hens[0] - grains[0]) + grains[n - 1] - grains[0];
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (check(hens, grains, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean check(int[] hens, int[] grains, int time) {
        int i = 0, n = grains.length;
        for (int hen : hens) {
            if (i == n) {
                return true;
            }
            int grain = grains[i];
            if (grain <= hen) {
                int cost = hen - grains[i];
                if (cost > time) {
                    return false;
                }
                while (i < n && grains[i] <= hen) {
                    i++;
                }
                /*
                 * 代码的意义: 选择最优的走路方案
                 *
                 * 先向右再向左
                 * ------------------------->
                 *                  <--------
                 *                        min
                 * 先向左再向右
                 * min
                 * <-------
                 * ------------------------->
                 */
                while (i < n && Math.min(cost, grains[i] - hen) + grains[i] - grain <= time) {
                    i++;
                }
            } else {
                while (i < n && grains[i] - hen <= time) {
                    i++;
                }
            }
        }
        return i == n;
    }

}
