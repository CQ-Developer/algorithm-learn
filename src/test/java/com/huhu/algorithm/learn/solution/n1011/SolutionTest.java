package com.huhu.algorithm.learn.solution.n1011;

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
        assertEquals(15, solution.shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
    }

    @Test
    void test_b() {
        assertEquals(6, solution.shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 3));
    }

    @Test
    void test_c() {
        assertEquals(3, solution.shipWithinDays(new int[]{1, 2, 3, 1, 1}, 4));
    }

}