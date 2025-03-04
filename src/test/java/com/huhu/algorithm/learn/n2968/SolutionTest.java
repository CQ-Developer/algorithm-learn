package com.huhu.algorithm.learn.n2968;

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
        int[] nums = {1, 2, 6, 4};
        assertEquals(3, solution.maxFrequencyScore(nums, 3));
    }

    @Test
    void testB() {
        int[] nums = {1, 4, 4, 2, 4};
        assertEquals(3, solution.maxFrequencyScore(nums, 0));
    }

}
