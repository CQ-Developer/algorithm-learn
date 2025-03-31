package com.huhu.algorithm.learn.solution.n2269;

/**
 * sliding window - AC
 */
class Aoo implements Solution {

    @Override
    public int divisorSubstrings(int num, int k) {
        int mask = 1, tmp = num;
        while (tmp / 10 > 0) {
            mask *= 10;
            tmp /= 10;
        }
        int bit = 1;
        for (int i = 1; i < k; i++) {
            bit *= 10;
        }
        int res = 0, cnt = 0, cur = 0;
        while (mask > 0) {
            cur = cur * 10 + (num / mask) % 10;
            cnt++;
            if (cnt == k) {
                if (cur != 0 && num % cur == 0) {
                    res++;
                }
                // 十进制最高位移出
                cur %= bit;
                cnt--;
            }
            mask /= 10;
        }
        return res;
    }

}
