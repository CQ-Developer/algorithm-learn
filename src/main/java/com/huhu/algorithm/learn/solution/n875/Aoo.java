package com.huhu.algorithm.learn.solution.n875;

class Aoo implements Solution {

    @Override
    public int minEatingSpeed(int[] piles, int h) {
        long sum = 0;
        int mx = 0;
        for (int pile : piles) {
            sum += pile;
            mx = Math.max(mx, pile);
        }
        int l = (int) ((sum + h - 1) / h), r = mx;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (check(piles, m, h)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private boolean check(int[] piles, int v, int h) {
        int cost = 0;
        for (int pile : piles) {
            cost += (pile + v - 1) / v;
            if (cost > h) {
                return false;
            }
        }
        return true;
    }

}
