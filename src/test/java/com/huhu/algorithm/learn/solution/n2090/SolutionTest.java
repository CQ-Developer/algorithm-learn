package com.huhu.algorithm.learn.solution.n2090;

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
        int[] expected = {-1, -1, -1, 5, 4, 4, -1, -1, -1};
        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        assertArrayEquals(expected, solution.getAverages(nums, 3));
    }

    @Test
    void testB() {
        int[] expected = {100000};
        int[] nums = {100000};
        assertArrayEquals(expected, solution.getAverages(nums, 0));
    }

    @Test
    void testC() {
        int[] expected = {-1};
        int[] nums = {8};
        assertArrayEquals(expected, solution.getAverages(nums, 100000));
    }

}
