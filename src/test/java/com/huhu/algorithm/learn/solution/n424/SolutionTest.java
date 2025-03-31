package com.huhu.algorithm.learn.solution.n424;

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
        assertEquals(4, solution.characterReplacement("ABAB", 2));
    }

    @Test
    void test_b() {
        assertEquals(4, solution.characterReplacement("AABABBA", 1));
    }

}