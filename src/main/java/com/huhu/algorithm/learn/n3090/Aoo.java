package com.huhu.algorithm.learn.n3090;

/**
 * AC
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int maximumLengthSubstring(String s) {
        int mx = 0;
        var table = new int[26];
        for (int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            table[c - 'a']++;
            while (table[c - 'a'] > 2) {
                table[s.charAt(l) - 'a']--;
                l++;
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }

}
