package com.huhu.algorithm.learn.n1888;

/**
 * sliding window - AC
 */
class Aoo implements Solution {

    @Override
    public int minFlips(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length, cnt = 0;
        // mask表示01
        for (int i = 0, mask = 0; i < n; i++, mask ^= 1) {
            // 通过操作2改成010101...这种模式
            if (chars[i] - '0' == mask) {
                cnt++;
            }
        }
        // 101010...这种模式就是 n - cnt
        int res = Math.min(cnt, n - cnt);
        // 偶数长度不用再做了
        if ((n & 1) == 0) {
            return res;
        }
        // 操作1相当于将s看成一个头尾相接的环
        // 010+010 -> 010+101, 从统计01变成统计10
        // mask表示10
        for (int i = 0, mask = 1; i < n; i++, mask ^= 1) {
            cnt += chars[i] - '0' == mask ? 1 : -1;
            res = Math.min(res, Math.min(cnt, n - cnt));
        }
        return res;
    }

}
