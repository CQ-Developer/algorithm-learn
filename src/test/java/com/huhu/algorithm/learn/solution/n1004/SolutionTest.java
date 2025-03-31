package com.huhu.algorithm.learn.solution.n1004;

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
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        assertEquals(6, solution.longestOnes(nums, 2));
    }

    @Test
    void testB() {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        assertEquals(10, solution.longestOnes(nums, 3));
    }

}
