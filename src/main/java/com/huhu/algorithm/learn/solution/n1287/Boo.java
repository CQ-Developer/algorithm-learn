package com.huhu.algorithm.learn.solution.n1287;

/**
 * two pointers
 */
class Boo implements Solution {

    @Override
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int l = 0;
        while (l < n) {
            int r = l;
            while (r < n && arr[r] == arr[l]) {
                r++;
            }
            if (r - l > n / 4) {
                break;
            }
            l = r;
        }
        return arr[l];
    }

}
