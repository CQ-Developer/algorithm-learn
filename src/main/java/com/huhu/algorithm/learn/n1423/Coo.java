package com.huhu.algorithm.learn.n1423;

/**
 * sliding window - AC
 */
class Coo implements Solution {

    @Override
    public int maxScore(int[] cardPoints, int k) {
        int win = 0, n = cardPoints.length;
        for (int i = 0; i < n - k; i++) {
            win += cardPoints[i];
        }
        int min = win, sum = win;
        for (int i = n - k; i < n; i++) {
            sum += cardPoints[i];
            win = win + cardPoints[i] - cardPoints[i + k - n];
            min = Math.min(min, win);
        }
        return sum - min;
    }

}
