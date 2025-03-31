package com.huhu.algorithm.learn.solution.n3411;

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
        int[] nums = {1, 2, 1, 2, 1, 1, 1};
        assertEquals(5, solution.maxLength(nums));
    }

    @Test
    void testB() {
        int[] nums = {2, 3, 4, 5, 6};
        assertEquals(3, solution.maxLength(nums));
    }

    @Test
    void testC() {
        int[] nums = {1, 2, 3, 1, 4, 5, 1};
        assertEquals(5, solution.maxLength(nums));
    }

}