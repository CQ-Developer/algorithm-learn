package com.huhu.algorithm.learn.solution.n1170;

import java.util.Arrays;

/**
 * binary search
 */
class Aoo implements Solution {

    @Override
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int m = words.length;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = count(words[i]);
        }
        Arrays.sort(arr);
        int n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = m - search(arr, count(queries[i]));
        }
        return res;
    }

    /**
     * find amount of the smallest letter
     */
    private int count(String s) {
        char c = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == c) {
                cnt++;
            } else if (x < c) {
                c = x;
                cnt = 1;
            }
        }
        return cnt;
    }

    /**
     * binary search
     */
    private int search(int[] arr, int target) {
        int l = -1, r = arr.length;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (arr[i] > target) {
                r = i;
            } else {
                l = i;
            }
        }
        return r;
    }

}
