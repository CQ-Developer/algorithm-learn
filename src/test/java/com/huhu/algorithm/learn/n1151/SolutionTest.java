package com.huhu.algorithm.learn.n1151;

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
        int[] arr = {1, 0, 1, 0, 1};
        assertEquals(1, solution.minSwaps(arr));
    }

    @Test
    void testB() {
        int[] arr = {1, 0, 1, 0, 1, 1};
        assertEquals(1, solution.minSwaps(arr));
    }

}