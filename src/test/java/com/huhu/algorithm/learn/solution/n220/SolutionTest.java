package com.huhu.algorithm.learn.solution.n220;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getInstance();

    @BeforeEach
    void setup() {
        solution = getInstance();
    }

    @Test
    void testA() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsNearbyAlmostDuplicate(nums, 3, 0));
    }

    @Test
    void testB() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        assertFalse(solution.containsNearbyAlmostDuplicate(nums, 2, 3));
    }

    @Test
    void testC() {
        int[] nums = {2, 2};
        assertTrue(solution.containsNearbyAlmostDuplicate(nums, 2, 0));
    }

}