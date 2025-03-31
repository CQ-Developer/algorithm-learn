package com.huhu.algorithm.learn.solution.n2134;

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
        int[] nums = {0, 1, 0, 1, 1, 0, 0};
        assertEquals(1, solution.minSwaps(nums));
    }

    @Test
    void testB() {
        int[] nums = {0, 1, 1, 1, 0, 0, 1, 1, 0};
        assertEquals(2, solution.minSwaps(nums));
    }

    @Test
    void testC() {
        int[] nums = {1, 1, 0, 0, 1};
        assertEquals(0, solution.minSwaps(nums));
    }

    @Test
    void testD() {
        int[] nums = {0, 1, 0, 0, 1, 0, 0, 0, 1};
        assertEquals(1, solution.minSwaps(nums));
    }

}
