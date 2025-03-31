package com.huhu.algorithm.learn.solution.n1052;

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
        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5}, grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        assertEquals(16, solution.maxSatisfied(customers, grumpy, 3));
    }

    @Test
    void testB() {
        int[] customers = {1}, grumpy = {0};
        assertEquals(1, solution.maxSatisfied(customers, grumpy, 1));
    }

}
