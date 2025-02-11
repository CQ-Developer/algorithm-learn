package com.huhu.algorithm.learn.n904;

/**
 * sliding window
 */
class Coo implements Solution {

    /**
     * 和{@link Boo}的算法相同,
     * 只是使用{@link java.lang.reflect.Array}代替{@link java.util.Map}提升性能.
     */
    @Override
    public int totalFruit(int[] fruits) {
        int l = 0, n = fruits.length;
        int[] table = new int[n];
        for (int cnt = 0, r = 0; r < n; r++) {
            if (++table[fruits[r]] == 1) {
                cnt++;
            }
            if (cnt > 2) {
                if (--table[fruits[l]] == 0) {
                    cnt--;
                }
                l++;
            }
        }
        return n - l;
    }

}
