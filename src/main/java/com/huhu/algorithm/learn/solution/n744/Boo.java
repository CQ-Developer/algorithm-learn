package com.huhu.algorithm.learn.solution.n744;

/**
 * binary search
 */
class Boo implements Solution {

    /**
     * left-closed right-open interval
     */
    @Override
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length;
        while (l < r) {
            int i = l + (r - l) / 2;
            if (letters[i] > target) {
                r = i;
            } else {
                l = i + 1;
            }
        }
        if (r == letters.length) {
            return letters[0];
        }
        return letters[r];
    }

}
