package com.huhu.algorithm.learn.solution.n1385;

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
        int[] arr1 = {4, 5, 8}, arr2 = {10, 9, 1, 8};
        assertEquals(2, solution.findTheDistanceValue(arr1, arr2, 2));
    }

    @Test
    void test_b() {
        int[] arr1 = {1, 4, 2, 3}, arr2 = {-4, -3, 6, 10, 20, 30};
        assertEquals(2, solution.findTheDistanceValue(arr1, arr2, 3));
    }

    @Test
    void test_c() {
        int[] arr1 = {2, 1, 100, 3}, arr2 = {-5, -2, 10, -3, 7};
        assertEquals(1, solution.findTheDistanceValue(arr1, arr2, 6));
    }

}