package com.huhu.algorithm.learn.n1493;

/**
 * <h1>sliding window</h1>
 */
class Aoo implements Solution {

    /**
     * <p>使用变量{@code left}记录i位置左侧连续1的数量,
     * 使用变量{@code right}记录i位置右侧连续1的数量.</p>
     *
     * <p>当来到j位置时, 状态为[...111i11j...],
     * j位置左侧连续1的数量为{@code right}, 即{@code left = right}.
     * 右侧连续1的数量还未统计, 即{@code right = 0}.</p>
     *
     * <p>特殊情况处理, 当数组中元素全为1时则{@code mx = nums.length},
     * 由于必须要删除1个元素, 所以结果为{@code mx - 1}.</p>
     */
    @Override
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0, mx = 0;
        for (int num : nums) {
            if (num == 1) {
                right++;
            } else {
                left = right;
                right = 0;
            }
            mx = Math.max(mx, left + right);
        }
        return mx == nums.length ? mx - 1 : mx;
    }

}
