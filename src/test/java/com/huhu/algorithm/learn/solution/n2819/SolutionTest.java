package com.huhu.algorithm.learn.solution.n2819;

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
        int[] prices = {1, 9, 22, 10, 19};
        int[][] queries = {{18, 4}, {5, 2}};
        assertArrayEquals(new long[]{34, -21}, solution.minimumRelativeLosses(prices, queries));
    }

    @Test
    void test_b() {
        int[] prices = {1, 5, 4, 3, 7, 11, 9};
        int[][] queries = {{5, 4}, {5, 7}, {7, 3}, {4, 5}};
        assertArrayEquals(new long[]{4, 16, 7, 1}, solution.minimumRelativeLosses(prices, queries));
    }

    @Test
    void test_c() {
        int[] prices = {5, 6, 7};
        int[][] queries = {{10, 1}, {5, 3}, {3, 3}};
        assertArrayEquals(new long[]{5, 12, 0}, solution.minimumRelativeLosses(prices, queries));
    }

}