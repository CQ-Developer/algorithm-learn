package com.huhu.algorithm.learn.n1358;

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
        assertEquals(10, solution.numberOfSubstrings("abcabc"));
    }

    @Test
    void test_b() {
        assertEquals(3, solution.numberOfSubstrings("aaacb"));
    }

    @Test
    void test_c() {
        assertEquals(1, solution.numberOfSubstrings("abc"));
    }

}