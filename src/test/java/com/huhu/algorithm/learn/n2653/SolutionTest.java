package com.huhu.algorithm.learn.n2653;

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
        int[] nums = {1, -1, -3, -2, 3};
        int[] expected = {-1, -2, -2};
        assertArrayEquals(expected, solution.getSubarrayBeauty(nums, 3, 2));
    }

    @Test
    void testB() {
        int[] nums = {-1, -2, -3, -4, -5};
        int[] expected = {-1, -2, -3, -4};
        assertArrayEquals(expected, solution.getSubarrayBeauty(nums, 2, 2));
    }

    @Test
    void testC() {
        int[] nums = {-3, 1, 2, -3, 0, -3};
        int[] expected = {-3, 0, -3, -3, -3};
        assertArrayEquals(expected, solution.getSubarrayBeauty(nums, 2, 1));
    }

}
