package com.huhu.algorithm.learn.n3306;

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
        assertEquals(0, solution.countOfSubstrings("aeioqq", 1));
    }

    @Test
    void test_b() {
        assertEquals(1, solution.countOfSubstrings("aeiou", 0));
    }

    @Test
    void test_c() {
        assertEquals(3, solution.countOfSubstrings("ieaouqqieaouqq", 1));
    }

}