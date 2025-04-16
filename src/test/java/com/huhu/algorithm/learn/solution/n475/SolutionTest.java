package com.huhu.algorithm.learn.solution.n475;

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
        assertEquals(1, solution.findRadius(new int[]{1, 2, 3}, new int[]{2}));
    }

    @Test
    void test_b() {
        assertEquals(1, solution.findRadius(new int[]{1, 2, 3, 4}, new int[]{1, 4}));
    }

    @Test
    void test_c() {
        assertEquals(3, solution.findRadius(new int[]{1, 5}, new int[]{2}));
    }

}