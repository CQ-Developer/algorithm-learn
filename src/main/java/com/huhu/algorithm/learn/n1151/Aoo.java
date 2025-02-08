package com.huhu.algorithm.learn.n1151;

/**
 * AC
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int minSwaps(int[] arr) {
        int k = 0;
        for (int num : arr) {
            k += num;
        }

        int mx = 0;
        for (int i = 0; i < k; i++) {
            mx += arr[i];
        }

        int res = k - mx;
        for (int i = k; i < arr.length; i++) {
            mx += arr[i];
            mx -= arr[i - k];
            res = Math.min(res, k - mx);
        }

        return res;
    }

}
