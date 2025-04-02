package com.huhu.algorithm.learn.solution.n2300;

import java.util.Arrays;

/**
 * binary search
 */
class Aoo implements Solution {

    @Override
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length, m = potions.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            res[i] = m - search(potions, (success + spell - 1) / spell);
        }
        return res;
    }

    /**
     * [l...r]
     */
    private int search(int[] potions, long target) {
        int l = 0, r = potions.length - 1;
        while (l <= r) {
            int i = l + (r - l) / 2;
            if (potions[i] >= target) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
        return l;
    }

}
