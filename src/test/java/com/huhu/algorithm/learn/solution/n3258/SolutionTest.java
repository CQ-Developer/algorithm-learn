package com.huhu.algorithm.learn.solution.n3258;

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
        assertEquals(12, solution.countKConstraintSubstrings("10101", 1));
    }

    @Test
    void test_b() {
        assertEquals(25, solution.countKConstraintSubstrings("1010101", 2));
    }

    @Test
    void test_c() {
        assertEquals(15, solution.countKConstraintSubstrings("11111", 1));
    }

}