package com.huhu.algorithm.learn.n2958;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getInstance();

    @BeforeEach
    void setup() {
        solution = getInstance();
    }

    @Test
    void testA() {
        int[] nums = {1, 2, 3, 1, 2, 3, 1, 2};
        assertEquals(6, solution.maxSubarrayLength(nums, 2));
    }

    @Test
    void testB() {
        int[] nums = {1, 2, 1, 2, 1, 2, 1, 2};
        assertEquals(2, solution.maxSubarrayLength(nums, 1));
    }

    @Test
    void testC() {
        int[] nums = {5, 5, 5, 5, 5, 5, 5};
        assertEquals(4, solution.maxSubarrayLength(nums, 4));
    }

}
