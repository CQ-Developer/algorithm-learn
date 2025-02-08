package com.huhu.algorithm.learn.n1984;

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
        int[] nums = {90};
        assertEquals(0, solution.minimumDifference(nums, 1));
    }

    @Test
    void testB() {
        int[] nums = {9, 4, 1, 7};
        assertEquals(2, solution.minimumDifference(nums, 2));
    }

}