package com.huhu.algorithm.learn.n3306;

import java.util.Set;

/**
 * sliding window
 */
class Aoo implements Solution {

    static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    @Override
    public long countOfSubstrings(String word, int k) {
        char[] s = word.toCharArray();
        int n = s.length;
        long res = 0;
        int[] arr1 = new int[27], arr2 = new int[27];
        for (int vo1 = 0, vo2 = 0, co1 = 0, co2 = 0, l1 = 0, l2 = 0, r = 0; r < n; r++) {
            if (VOWELS.contains(s[r])) {
                if (arr1[s[r] & 0x1f]++ == 0) {
                    vo1++;
                }
                if (arr2[s[r] & 0x1f]++ == 0) {
                    vo2++;
                }
            } else {
                co1++;
                co2++;
            }
            for (; vo1 == VOWELS.size() && co1 >= k; l1++) {
                if (VOWELS.contains(s[l1])) {
                    if (--arr1[s[l1] & 0x1f] == 0) {
                        vo1--;
                    }
                } else {
                    co1--;
                }
            }
            for (; vo2 == VOWELS.size() && co2 >= k + 1; l2++) {
                if (VOWELS.contains(s[l2])) {
                    if (--arr2[s[l2] & 0x1f] == 0) {
                        vo2--;
                    }
                } else {
                    co2--;
                }
            }
            res += l1 - l2;
        }
        return res;
    }

}
