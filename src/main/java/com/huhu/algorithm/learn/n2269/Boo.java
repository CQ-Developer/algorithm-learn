package com.huhu.algorithm.learn.n2269;

/**
 * math - AC
 */
class Boo implements Solution {

    @Override
    public int divisorSubstrings(int num, int k) {
        int n = 1;
        for (int i = 0; i < k; i++) {
            n *= 10;
        }
        int res = 0, m = num;
        while (m >= n / 10) {
            int cur = m % n;
            if (cur > 0 && num % cur == 0) {
                res++;
            }
            // 移除最低位
            m /= 10;
        }
        return res;
    }

}
