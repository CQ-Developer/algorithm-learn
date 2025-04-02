package com.huhu.algorithm.learn.solution.n2300;

import java.util.Arrays;

/**
 * binary search
 */
class Boo implements Solution {

    @Override
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length, m = potions.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = m - search(potions, (success - 1) / spells[i]);
        }
        return res;
    }

    /**
     * (l...r)
     */
    private int search(int[] potions, long target) {
        int l = -1, r = potions.length;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (potions[i] > target) {
                r = i;
            } else {
                l = i;
            }
        }
        return r;
    }

}
