package com.huhu.algorithm.learn.solution.n2187;

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
        assertEquals(3, solution.minimumTime(new int[]{1, 2, 3}, 5));
    }

    @Test
    void test_b() {
        assertEquals(2, solution.minimumTime(new int[]{2}, 1));
    }

}