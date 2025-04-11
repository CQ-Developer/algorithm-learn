package com.huhu.algorithm.learn.solution.n1287;

/**
 * dynamic programming
 */
class Coo implements Solution {

    @Override
    public int findSpecialInteger(int[] arr) {
        int cur = arr[0], cnt = 0;
        for (int x : arr) {
            if (x == cur) {
                if (++cnt * 4 > arr.length) {
                    break;
                }
            } else {
                cur = x;
                cnt = 1;
            }
        }
        return cur;
    }

}
