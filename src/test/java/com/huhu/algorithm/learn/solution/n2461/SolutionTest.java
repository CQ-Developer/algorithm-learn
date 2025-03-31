package com.huhu.algorithm.learn.solution.n2461;

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
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        assertEquals(15, solution.maximumSubarraySum(nums, 3));
    }

    @Test
    void testB() {
        int[] nums = {4, 4, 4};
        assertEquals(0, solution.maximumSubarraySum(nums, 3));
    }

}
