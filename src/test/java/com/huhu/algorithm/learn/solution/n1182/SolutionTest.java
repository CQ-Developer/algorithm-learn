package com.huhu.algorithm.learn.solution.n1182;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        int[] colors = {1, 1, 2, 1, 3, 2, 2, 3, 3};
        int[][] queries = {{1, 3}, {2, 2}, {6, 1}};
        assertIterableEquals(List.of(3, 0, 3), solution.shortestDistanceColor(colors, queries));
    }

    @Test
    void test_b() {
        int[] colors = {1, 2};
        int[][] queries = {{0, 3}};
        assertIterableEquals(List.of(-1), solution.shortestDistanceColor(colors, queries));
    }

}