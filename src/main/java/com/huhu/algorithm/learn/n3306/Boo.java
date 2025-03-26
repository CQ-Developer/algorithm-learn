package com.huhu.algorithm.learn.n3306;

/**
 * sliding window & binary manipulation
 */
class Boo implements Solution {

    /**
     * a=0, e=4, i=8, o=14, u=20
     * represent by binary str is 00000000000100000100000100010001
     * which is 0x104111.
     */
    static final int MASK = 0x104111;

    @Override
    public long countOfSubstrings(String word, int k) {
        char[] s = word.toCharArray();
        int n = s.length;
        long res = 0;
        int[] arr1 = new int[26], arr2 = new int[26];
        for (int vo1 = 0, vo2 = 0, co1 = 0, co2 = 0, l1 = 0, l2 = 0, r = 0; r < n; r++) {
            int i = s[r] - 'a';
            if ((MASK >> i & 1) != 0) {
                if (arr1[i]++ == 0) {
                    vo1++;
                }
                if (arr2[i]++ == 0) {
                    vo2++;
                }
            } else {
                co1++;
                co2++;
            }
            for (; vo1 == 5 && co1 >= k; l1++) {
                int j = s[l1] - 'a';
                if ((MASK >> j & 1) != 0) {
                    if (--arr1[j] == 0) {
                        vo1--;
                    }
                } else {
                    co1--;
                }
            }
            for (; vo2 == 5 && co2 >= k + 1; l2++) {
                int j = s[l2] - 'a';
                if ((MASK >> j & 1) != 0) {
                    if (--arr2[j] == 0) {
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
