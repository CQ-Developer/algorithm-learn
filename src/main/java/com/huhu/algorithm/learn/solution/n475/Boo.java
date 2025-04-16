package com.huhu.algorithm.learn.solution.n475;

import java.util.Arrays;

class Boo implements Solution {

    @Override
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int res = 0;
        for (int house : houses) {
            int i = search(heaters, house);
            int r = i < heaters.length ? heaters[i] - house : Integer.MAX_VALUE;
            int l = i > 0 ? house - heaters[i - 1] : Integer.MAX_VALUE;
            res = Math.max(res, Math.min(r, l));
        }
        return res;
    }

    /**
     * binary search
     */
    private int search(int[] heaters, int house) {
        int l = -1, r = heaters.length;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (heaters[m] >= house) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

}
