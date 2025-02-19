package com.huhu.algorithm.learn.n2009;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void testA() {
        int[] nums = {4, 2, 5, 3};
        assertEquals(0, solution.minOperations(nums));
    }

    @Test
    void testB() {
        int[] nums = {1, 2, 3, 5, 6};
        assertEquals(1, solution.minOperations(nums));
    }

    @Test
    void testC() {
        int[] nums = {1, 10, 100, 1000};
        assertEquals(3, solution.minOperations(nums));
    }

}