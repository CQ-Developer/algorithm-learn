package com.huhu.algorithm.learn.n2495;

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
    void test_a() {
        int[] nums = {9, 6, 7, 13};
        assertEquals(6, solution.evenProduct(nums));
    }

    @Test
    void test_b() {
        int[] nums = {7, 3, 5};
        assertEquals(0, solution.evenProduct(nums));
    }

}