package com.huhu.algorithm.learn.solution.n2070;

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
        int[][] items = {{1, 2}, {3, 2}, {2, 4}, {5, 6}, {3, 5}};
        int[] queries = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(new int[]{2, 4, 5, 5, 6, 6}, solution.maximumBeauty(items, queries));
    }

    @Test
    void test_b() {
        int[][] items = {{1, 2}, {1, 2}, {1, 3}, {1, 4}};
        int[] queries = {1};
        assertArrayEquals(new int[]{4}, solution.maximumBeauty(items, queries));
    }

    @Test
    void test_c() {
        int[][] items = {{10, 1000}};
        int[] queries = {5};
        assertArrayEquals(new int[]{0}, solution.maximumBeauty(items, queries));
    }

}