package com.huhu.algorithm.learn.n395;

///  # divide and conquer
class Boo implements Solution {

    @Override
    public int longestSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        return f(chars, 0, chars.length - 1, k);
    }

    private int f(char[] s, int l, int r, int k) {
        int[] cnt = new int[27];
        for (int i = l; i <= r; i++) {
            cnt[s[i] & 31]++;
        }
        for (int i = 1; i <= 26; i++) {
            if (cnt[i] > 0 && cnt[i] < k) {
                int mx = 0;
                for (int _l = l; _l <= r; ) {
                    while (_l <= r && (s[_l] & 31) == i) {
                        _l++;
                    }
                    if (_l > r) {
                        break;
                    }
                    int _r = _l;
                    while (_r <= r && (s[_r] & 31) != i) {
                        _r++;
                    }
                    mx = Math.max(mx, f(s, _l, _r - 1, k));
                    _l = _r;
                }
                return mx;
            }
        }
        return r - l + 1;
    }

}
