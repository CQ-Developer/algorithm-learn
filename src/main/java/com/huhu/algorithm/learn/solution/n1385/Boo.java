package com.huhu.algorithm.learn.solution.n1385;

import java.util.Arrays;

/**
 * two pointers
 */
class Boo implements Solution {

    @Override
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int res = 0, n = arr1.length, m = arr2.length;
        for (int i = 0, j = 0; i < n; i++) {
            while (j < m && arr2[j] < arr1[i] - d) {
                j++;
            }
            if (j == m || arr2[j] > arr1[i] + d) {
                res++;
            }
        }
        return res;
    }

}
