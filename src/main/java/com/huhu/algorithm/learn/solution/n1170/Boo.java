package com.huhu.algorithm.learn.solution.n1170;

/**
 * suffix sum
 */
class Boo implements Solution {

    @Override
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] count = new int[12];
        for (String word : words) {
            count[f(word)]++;
        }
        for (int i = 9; i >= 0; i--) {
            count[i] += count[i + 1];
        }
        int n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = count[f(queries[i]) + 1];
        }
        return res;
    }

    private int f(String s) {
        int cnt = 1;
        char c = s.charAt(0);
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

}
