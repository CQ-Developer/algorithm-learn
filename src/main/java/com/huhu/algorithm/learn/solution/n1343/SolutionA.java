package com.huhu.algorithm.learn.solution.n1343;

/**
 * sliding window
 */
class SolutionA implements Solution {

    @Override
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int res = 0, avg = k * threshold;
        if (sum >= avg) {
            res++;
        }
        int n = arr.length;
        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum >= avg) {
                res++;
            }
        }
        return res;
    }

}
