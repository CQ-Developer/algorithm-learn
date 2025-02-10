package com.huhu.algorithm.learn.n1493;

/**
 * <h1>sliding window</h1>
 */
class Boo implements Solution {

    /**
     * <p>使用{@code cnt}记录{@code [l...r]}范围内{@code 0}的数量.
     * 由于{@code [l...r]}范围内可能存在0, 所以长度为{@code r - l};
     * 或者范围内全为{@code 1}, 由于必须删除1个元素, 所以长度也为{@code r - l}.</p>
     *
     * <p>若{@code cnt > 1}, 则右移左边界{@code l}直到遇到{@code nums[j] = 0},
     * 将{@code l}设置到{@code j + 1}位置, 保证{@code [l...r]}范围内{@code cnt <= 1}.</p>
     */
    @Override
    public int longestSubarray(int[] nums) {
        int mx = 0, n = nums.length;
        for (int l = 0, r = 0, cnt = 0; r < n; r++) {
            if (nums[r] == 0) {
                cnt++;
                for (; cnt > 1; l++) {
                    if (nums[l] == 0) {
                        cnt--;
                    }
                }
            }
            mx = Math.max(mx, r - l);
        }
        return mx;
    }

}
