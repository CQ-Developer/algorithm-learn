package com.huhu.algorithm.learn.solution.n1283;

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
        assertEquals(5, solution.smallestDivisor(new int[]{1, 2, 5, 9}, 6));
    }

    @Test
    void test_b() {
        assertEquals(44, solution.smallestDivisor(new int[]{44, 22, 33, 11, 1}, 5));
    }

    @Test
    void test_c() {
        assertEquals(4, solution.smallestDivisor(new int[]{19}, 5));
    }

    @Test
    void test_d() {
        assertEquals(3, solution.smallestDivisor(new int[]{2, 3, 5, 7, 11}, 11));
    }

}