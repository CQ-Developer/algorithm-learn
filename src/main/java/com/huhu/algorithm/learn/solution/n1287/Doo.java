package com.huhu.algorithm.learn.solution.n1287;

class Doo implements Solution {

    @Override
    public int findSpecialInteger(int[] arr) {
        int n = arr.length, span = n / 4 + 1;
        for (int i = 0; i < n; i += span) {
            int l = search(arr, arr[i]);
            int r = search(arr, arr[i] + 1);
            if (r - l >= span) {
                return arr[l];
            }
        }
        return -1;
    }

    /**
     * binary search
     */
    private int search(int[] arr, int target) {
        int l = -1, r = arr.length;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (arr[m] >= target) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

}
