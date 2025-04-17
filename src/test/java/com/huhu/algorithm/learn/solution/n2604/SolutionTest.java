package com.huhu.algorithm.learn.solution.n2604;

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
        assertEquals(2, solution.minimumTime(new int[]{3, 6, 7}, new int[]{2, 4, 7, 9}));
    }

    @Test
    void test_b() {
        assertEquals(1, solution.minimumTime(new int[]{4, 6, 109, 111, 213, 215}, new int[]{5, 110, 214}));
    }

}