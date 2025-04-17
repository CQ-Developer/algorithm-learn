package com.huhu.algorithm.learn.solution.n1482;

class Aoo implements Solution {

    @Override
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) {
            return -1;
        }
        int mn = bloomDay[0], mx = bloomDay[0];
        for (int day : bloomDay) {
            mn = Math.min(mn, day);
            mx = Math.max(mx, day);
        }
        int l = mn - 1, r = mx + 1;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (check(bloomDay, mid, m, k)) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r;
    }

    private boolean check(int[] days, int d, int m, int k) {
        int seq = 0;
        for (int day : days) {
            if (day <= d) {
                seq++;
            } else {
                seq = 0;
            }
            if (seq == k) {
                seq = 0;
                m--;
            }
            if (m == 0) {
                return true;
            }
        }
        return false;
    }

}
