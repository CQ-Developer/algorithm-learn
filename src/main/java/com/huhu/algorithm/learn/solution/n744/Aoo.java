package com.huhu.algorithm.learn.solution.n744;

/**
 * binary search
 */
class Aoo implements Solution {

    /**
     * closed interval
     */
    @Override
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1;
        while (l <= r) {
            int i = l + (r - l) / 2;
            if (letters[i] > target) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
        if (l == letters.length) {
            return letters[0];
        }
        return letters[l];
    }

}
