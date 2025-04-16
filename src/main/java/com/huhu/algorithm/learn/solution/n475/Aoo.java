package com.huhu.algorithm.learn.solution.n475;

import java.util.Arrays;

class Aoo implements Solution {

    @Override
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res = 0;
        for (int i = 0, j = 0; i < houses.length; i++) {
            int cur = Math.abs(houses[i] - heaters[j]);
            while (j + 1 < heaters.length && Math.abs(houses[i] - heaters[j]) >= Math.abs(houses[i] - heaters[j + 1])) {
                cur = Math.min(cur, Math.abs(houses[i] - heaters[++j]));
            }
            res = Math.max(res, cur);
        }
        return res;
    }

}
