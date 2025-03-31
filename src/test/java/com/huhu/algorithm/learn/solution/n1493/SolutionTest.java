package com.huhu.algorithm.learn.solution.n1493;

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
        int[] nums = {1, 1, 0, 1};
        assertEquals(3, solution.longestSubarray(nums));
    }

    @Test
    void testB() {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        assertEquals(5, solution.longestSubarray(nums));
    }

    @Test
    void testC() {
        int[] nums = {1, 1, 1};
        assertEquals(2, solution.longestSubarray(nums));
    }

}
