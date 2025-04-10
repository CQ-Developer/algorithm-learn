package com.huhu.algorithm.learn.lcp.n8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        int[][] increase = {{2, 8, 4}, {2, 5, 0}, {10, 9, 8}},
                requirements = {{2, 11, 3}, {15, 10, 7}, {9, 17, 12}, {8, 1, 14}};
        assertArrayEquals(new int[]{2, -1, 3, -1}, solution.getTriggerTime(increase, requirements));
    }

    @Test
    void test_b() {
        int[][] increase = {{0, 4, 5}, {4, 8, 8}, {8, 6, 1}, {10, 10, 0}},
                requirements = {{12, 11, 16}, {20, 2, 6}, {9, 2, 6}, {10, 18, 3}, {8, 14, 9}};
        assertArrayEquals(new int[]{-1, 4, 3, 3, 3}, solution.getTriggerTime(increase, requirements));
    }

    @Test
    void test_c() {
        int[][] increase = {{1, 1, 1}}, requirements = {{0, 0, 0}};
        assertArrayEquals(new int[]{0}, solution.getTriggerTime(increase, requirements));
    }

}