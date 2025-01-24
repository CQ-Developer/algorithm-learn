package com.huhu.algorithm.learn.n643;

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
        int[] nums = {1, 12, -5, -6, 50, 3};
        assertEquals(12.75, solution.findMaxAverage(nums, 4));
    }

    @Test
    void testB() {
        int[] nums = {5};
        assertEquals(5.0, solution.findMaxAverage(nums, 1));
    }

}
