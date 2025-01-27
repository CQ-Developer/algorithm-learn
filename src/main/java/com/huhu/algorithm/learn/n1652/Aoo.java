package com.huhu.algorithm.learn.n1652;

/**
 * sliding window - AC
 */
class Aoo implements Solution {

    @Override
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int r = k > 0 ? k + 1 : n;
        k = k > 0 ? k : -k;
        int sum = 0;
        // window size is [r - w, r)
        for (int i = r - k; i < r; i++) {
            sum += code[i];
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++, r++) {
            res[i] = sum;
            sum = sum + code[r % n] - code[(r - k) % n];
        }
        return res;
    }

}
