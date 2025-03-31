package com.huhu.algorithm.learn.solution.n1343;

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
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        assertEquals(3, solution.numOfSubarrays(arr, 3, 4));
    }

    @Test
    void testB() {
        int[] arr = {11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
        assertEquals(6, solution.numOfSubarrays(arr, 3, 5));
    }

}