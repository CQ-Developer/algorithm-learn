package com.huhu.algorithm.learn.n3261;

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
        long[] expected = {26};
        int[][] queries = {{0, 6}};
        assertArrayEquals(expected, solution.countKConstraintSubstrings("0001111", 2, queries));
    }

    @Test
    void test_b() {
        long[] expected = {15, 9, 3};
        int[][] queries = {{0, 5}, {1, 4}, {2, 3}};
        assertArrayEquals(expected, solution.countKConstraintSubstrings("010101", 1, queries));
    }

}