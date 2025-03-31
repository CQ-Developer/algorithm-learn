package com.huhu.algorithm.learn.solution.n1852;

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
        int[] nums = {1, 2, 3, 2, 2, 1};
        int[] expected = {3, 2, 2, 2};
        assertArrayEquals(expected, solution.distinctNumbers(nums, 3));
    }

    @Test
    void testB() {
        int[] nums = {1, 2, 3, 2, 2, 1, 3};
        int[] expected = {3, 2, 2, 2, 3};
        assertArrayEquals(expected, solution.distinctNumbers(nums, 3));
    }

    @Test
    void testC() {
        int[] nums = {1, 1, 1, 1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, solution.distinctNumbers(nums, 4));
    }

}
