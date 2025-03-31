package com.huhu.algorithm.learn.solution.n2156;

/**
 * sliding window - AC
 */
class Aoo implements Solution {

    @Override
    public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        char[] c = s.toCharArray();
        int n = c.length;
        long hash = 0, pk = 1;
        // 秦九韶算法计算s[n-k:]的hash
        for (int i = n - 1; i >= n - k; i--) {
            hash = (hash * power + (c[i] & 31)) % modulo;
            pk = (pk * power) % modulo;
        }
        int ans = hash == hashValue ? n - k : 0;
        // 向左滑动窗口
        for (int i = n - k - 1; i >= 0; i--) {
            hash = (hash * power + (c[i] & 31) - pk * (c[i + k] & 31) % modulo + modulo) % modulo;
            if (hash == hashValue) {
                ans = i;
            }
        }
        return String.valueOf(c, ans, k);
    }

}
