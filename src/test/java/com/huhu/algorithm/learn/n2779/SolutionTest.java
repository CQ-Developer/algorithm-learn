package com.huhu.algorithm.learn.n2779;

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
        int[] nums = {4, 6, 1, 2};
        assertEquals(3, solution.maximumBeauty(nums, 2));
    }

    @Test
    void testB() {
        int[] nums = {1, 1, 1, 1};
        assertEquals(4, solution.maximumBeauty(nums, 10));
    }

}
