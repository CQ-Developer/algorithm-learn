package com.huhu.algorithm.learn.solution.n1011;

class Aoo implements Solution {

    @Override
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0, max = 0;
        for (int weight : weights) {
            sum += weight;
            max = Math.max(max, weight);
        }
        int l = max, r = sum;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (check(weights, m, days)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private boolean check(int[] weights, int cap, int days) {
        int cost = 1, weight = 0;
        for (int w : weights) {
            if (weight + w > cap) {
                weight = w;
                cost++;
            } else {
                weight += w;
            }
            if (cost > days) {
                return false;
            }
        }
        return true;
    }

}
