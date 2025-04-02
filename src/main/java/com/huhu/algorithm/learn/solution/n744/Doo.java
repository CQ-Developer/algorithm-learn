package com.huhu.algorithm.learn.solution.n744;

/**
 * binary search
 */
public class Doo implements Solution {

    /**
     * left-open right-closed interval
     */
    @Override
    public char nextGreatestLetter(char[] letters, char target) {
        int l = -1, r = letters.length - 1;
        while (l < r) {
            // 向上取整防止死循环
            int i = l + (r - l + 1) / 2;
            if (letters[i] > target) {
                r = i - 1;
            } else {
                l = i;
            }
        }
        if (r + 1 == letters.length) {
            return letters[0];
        }
        return letters[r + 1];
    }

}
