package com.huhu.algorithm.learn.n3298;

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
        assertEquals(1, solution.validSubstringCount("bcca", "abc"));
    }

    @Test
    void test_b() {
        assertEquals(10, solution.validSubstringCount("abcabc", "abc"));
    }

    @Test
    void test_c() {
        assertEquals(0, solution.validSubstringCount("abcabc", "aaabc"));
    }

}