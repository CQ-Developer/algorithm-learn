package com.huhu.algorithm.learn.n1652;

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
    void testA() {
        int[] code = {5, 7, 1, 4};
        int[] expected = {12, 10, 16, 13};
        assertArrayEquals(expected, solution.decrypt(code, 3));
    }

    @Test
    void testB() {
        int[] code = {1, 2, 3, 4};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, solution.decrypt(code, 0));
    }

    @Test
    void testC() {
        int[] code = {2, 4, 9, 3};
        int[] expected = {12, 5, 6, 13};
        assertArrayEquals(expected, solution.decrypt(code, -2));
    }

}
