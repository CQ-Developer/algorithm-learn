package com.huhu.algorithm.learn.n567;

import java.util.Arrays;

/**
 * sliding window - AC
 */
class Aoo implements Solution {

    @Override
    public boolean checkInclusion(String s1, String s2) {
        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray();
        int n = c1.length, m = c2.length;
        if (m < n) {
            return false;
        }
        int[] target = new int[26], window = new int[26];
        for (int i = 0; i < n; i++) {
            target[c1[i] - 'a']++;
            window[c2[i] - 'a']++;
        }
        boolean res = Arrays.equals(target, window);
        for (int i = n; i < m && !res; i++) {
            window[c2[i] - 'a']++;
            window[c2[i - n] - 'a']--;
            res = Arrays.equals(target, window);
        }
        return res;
    }

}
