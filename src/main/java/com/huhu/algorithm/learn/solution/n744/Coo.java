package com.huhu.algorithm.learn.solution.n744;

/**
 * binary search
 */
class Coo implements Solution {

    /**
     * open interval
     */
    @Override
    public char nextGreatestLetter(char[] letters, char target) {
        int l = -1, r = letters.length;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (letters[i] > target) {
                r = i;
            } else {
                l = i;
            }
        }
        if (r == letters.length) {
            return letters[0];
        }
        return letters[r];
    }

}
