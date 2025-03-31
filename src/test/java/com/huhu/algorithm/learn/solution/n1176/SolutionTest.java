package com.huhu.algorithm.learn.solution.n1176;

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
        int[] calories = {1, 2, 3, 4, 5};
        assertEquals(0, solution.dietPlanPerformance(calories, 1, 3, 3));
    }

    @Test
    void testB() {
        int[] calories = {3, 2};
        assertEquals(1, solution.dietPlanPerformance(calories, 2, 0, 1));
    }

    @Test
    void testC() {
        int[] calories = {6, 5, 0, 0};
        assertEquals(0, solution.dietPlanPerformance(calories, 2, 1, 5));
    }

}