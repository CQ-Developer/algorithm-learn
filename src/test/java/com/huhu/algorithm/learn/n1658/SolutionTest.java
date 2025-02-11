package com.huhu.algorithm.learn.n1658;

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
        int[] nums = {1, 1, 4, 2, 3};
        assertEquals(2, solution.minOperations(nums, 5));
    }

    @Test
    void testB() {
        int[] nums = {5, 6, 7, 8, 9};
        assertEquals(-1, solution.minOperations(nums, 4));
    }

    @Test
    void testC() {
        int[] nums = {3, 2, 20, 1, 1, 3};
        assertEquals(5, solution.minOperations(nums, 10));
    }

}
