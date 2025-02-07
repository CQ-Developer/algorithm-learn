package com.huhu.algorithm.learn.n1016;

/**
 * brute force - AC
 */
class Aoo implements Solution {

    @Override
    public boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
            if (!s.contains(Integer.toBinaryString(i))) {
                return false;
            }
        }
        return true;
    }

}
