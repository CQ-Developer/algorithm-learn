package com.huhu.algorithm.learn.n1248;

/**
 * two pointers
 */
class Boo implements Solution {

    @Override
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0, n = nums.length;
        for (int l = 0, r = 0, odd = 0; r < n; r++) {
            if ((nums[r] & 1) == 1) {
                odd++;
            }
            if (odd == k) {
                int evenL = 0;
                for (; (nums[l] & 1) == 0; l++) {
                    evenL++;
                }
                int evenR = 0;
                for (int _r = r + 1; _r < n && (nums[_r] & 1) == 0; _r++, r++) {
                    evenR++;
                }
                res += (evenL + 1) * (evenR + 1);
                l++;
                odd--;
            }
        }
        return res;
    }

}
