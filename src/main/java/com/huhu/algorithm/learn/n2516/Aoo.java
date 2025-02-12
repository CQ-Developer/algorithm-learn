package com.huhu.algorithm.learn.n2516;

/**
 * sliding window
 */
class Aoo implements Solution {

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
        int mx = 0;
        for (int l = 0, r = 0; r < n; r++) {
            arr[chars[r] & 31]--;
            for (; arr[chars[r] & 31] < 0; l++) {
                arr[chars[l] & 31]++;
            }
            mx = Math.max(mx, r - l + 1);
        }
        return n - mx;
    }

}
