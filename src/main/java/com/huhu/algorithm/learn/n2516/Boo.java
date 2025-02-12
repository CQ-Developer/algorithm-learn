package com.huhu.algorithm.learn.n2516;

/**
 * sliding window
 */
class Boo implements Solution {

    /**
     * hold maximum window size
     */
    @Override
    public int takeCharacters(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] arr = {0, -k, -k, -k};
        for (char c : chars) {
            arr[c & 31]++;
        }
        if (arr[1] < 0 || arr[2] < 0 || arr[3] < 0) {
            return -1;
        }
        int l = 0, r = 0;
        while (r < n) {
            arr[chars[r] & 31]--;
            if (arr[1] < 0 || arr[2] < 0 || arr[3] < 0) {
                arr[chars[l] & 31]++;
                l++;
            }
            r++;
        }
        return n - r + l;
    }

}
