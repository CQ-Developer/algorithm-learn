package com.huhu.algorithm.learn.n3325;

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
        assertEquals(4, solution.numberOfSubstrings("abacb", 2));
    }

    @Test
    void test_b() {
        assertEquals(15, solution.numberOfSubstrings("abcde", 1));
    }

    @Test
    void test_c() {
        assertEquals(7, solution.numberOfSubstrings("ajsrhoebe", 2));
    }

}