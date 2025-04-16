package com.huhu.algorithm.learn.solution.n3296;

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
        assertEquals(3, solution.minNumberOfSeconds(4, new int[]{2, 1, 1}));
    }

    @Test
    void test_b() {
        assertEquals(12, solution.minNumberOfSeconds(10, new int[]{3, 2, 2, 4}));
    }

    @Test
    void test_c() {
        assertEquals(15, solution.minNumberOfSeconds(5, new int[]{1}));
    }

}