package com.huhu.algorithm.learn.n1176;

class Aoo implements Solution {

    @Override
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int total = 0;
        for (int i = 0; i < k; i++) {
            total += calories[i];
        }
        int points = total < lower ? -1 : total > upper ? 1 : 0;
        for (int i = k; i < calories.length; i++) {
            total += calories[i] - calories[i - k];
            points += total < lower ? -1 : total > upper ? 1 : 0;
        }
        return points;
    }

}
