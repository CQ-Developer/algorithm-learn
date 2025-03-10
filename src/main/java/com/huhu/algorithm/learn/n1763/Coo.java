package com.huhu.algorithm.learn.n1763;

/// # sliding window
class Coo implements Solution {

    @Override
    public String longestNiceSubstring(String s) {
        int n = s.length();
        var res = "";
        for (int target = 1; target <= 26; target++) {
            int[] lower = new int[27], upper = new int[27];
            int unique = 0, pairs = 0;
            for (int l = 0, r = 0; r < n; r++) {
                char c = s.charAt(r);
                int i = (c >= 'a' ? c : c ^ 32) & 31;
                // right side enter
                if (c >= 'a') {
                    if (++lower[i] == 1 && upper[i] > 0) {
                        pairs++;
                    }
                } else {
                    if (++upper[i] == 1 && lower[i] > 0) {
                        pairs++;
                    }
                }
                if (lower[i] + upper[i] == 1) {
                    unique++;
                }
                // left side leave
                for (; unique > target; l++) {
                    c = s.charAt(l);
                    i = (c >= 'a' ? c : c ^ 32) & 31;
                    if (c >= 'a') {
                        if (--lower[i] == 0 && upper[i] > 0) {
                            pairs--;
                        }
                    } else {
                        if (--upper[i] == 0 && lower[i] > 0) {
                            pairs--;
                        }
                    }
                    if (lower[i] + upper[i] == 0) {
                        unique--;
                    }
                }
                // update result
                if (unique == pairs) {
                    var _s = s.substring(l, r + 1);
                    if (_s.length() > res.length()) {
                        res = _s;
                    }
                }
            }
        }
        return res;
    }

}
