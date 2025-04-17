package com.huhu.algorithm.learn.solution.n1482;

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
        assertEquals(3, solution.minDays(new int[]{1, 10, 3, 10, 2}, 3, 1));
    }

    @Test
    void test_b() {
        assertEquals(-1, solution.minDays(new int[]{1, 10, 3, 10, 2}, 3, 2));
    }

    @Test
    void test_c() {
        assertEquals(12, solution.minDays(new int[]{7, 7, 7, 7, 12, 7, 7}, 2, 3));
    }

    @Test
    void test_d() {
        assertEquals(1000000000, solution.minDays(new int[]{1000000000, 1000000000}, 1, 1));
    }

    @Test
    void test_e() {
        assertEquals(9, solution.minDays(new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6}, 4, 2));
    }

}