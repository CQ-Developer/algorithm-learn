package com.huhu.algorithm.learn.solution.n2271;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void testA() {
        int[][] tiles = {{1, 5}, {10, 11}, {12, 18}, {20, 25}, {30, 32}};
        assertEquals(9, solution.maximumWhiteTiles(tiles, 10));
    }

    @Test
    void testB() {
        int[][] tiles = {{10, 11}, {1, 1}};
        assertEquals(2, solution.maximumWhiteTiles(tiles, 2));
    }

    @Test
    void testC() {
        int[][] tiles = {{8051, 8057}, {8074, 8089}, {7994, 7995}, {7969, 7987}, {8013, 8020}, {8123, 8139}, {7930, 7950}, {8096, 8104}, {7917, 7925}, {8027, 8035}, {8003, 8011}};
        assertEquals(126, solution.maximumWhiteTiles(tiles, 9854));
    }

    @Test
    void testD() {
        int[][] tiles = {{1, 1000000000}};
        assertEquals(1000000000, solution.maximumWhiteTiles(tiles, 1000000000));
    }

}