package com.huhu.algorithm.learn.n76;

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
        assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void test_b() {
        assertEquals("a", solution.minWindow("a", "a"));
    }

    @Test
    void test_c() {
        assertEquals("", solution.minWindow("a", "aa"));
    }

}