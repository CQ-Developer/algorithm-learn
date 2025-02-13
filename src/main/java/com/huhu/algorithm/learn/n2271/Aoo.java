package com.huhu.algorithm.learn.n2271;

import java.util.Arrays;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Arrays.sort(tiles, (a, b) -> a[0] - b[0]);
        int res = 0;
        for (int cover = 0, j = 0, i = 0; i < tiles.length; i++) {
            // 将毯子放在当前段的右端点
            cover += tiles[i][1] - tiles[i][0] + 1;
            // 毯子的左端点 = tiles[i][1] - carpetLen + 1
            for (; tiles[i][1] - carpetLen + 1 > tiles[j][1]; j++) {
                // 将第j段的瓷砖全部移除
                cover -= tiles[j][1] - tiles[j][0] + 1;
            }
            // Math.max(0, tiles[i][1] - carpetLen + 1 - tiles[j][0])
            // 表示未被覆盖的瓷砖
            res = Math.max(res, cover - Math.max(0, tiles[i][1] - carpetLen + 1 - tiles[j][0]));
        }
        return res;
    }

}
