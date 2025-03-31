package com.huhu.algorithm.learn.solution.n1156;

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
        assertEquals(3, solution.maxRepOpt1("ababa"));
    }

    @Test
    void test_b() {
        assertEquals(6, solution.maxRepOpt1("aaabaaa"));
    }

    @Test
    void test_c() {
        assertEquals(4, solution.maxRepOpt1("aaabbaaa"));
    }

    @Test
    void test_d() {
        assertEquals(5, solution.maxRepOpt1("aaaaa"));
    }

    @Test
    void test_e() {
        assertEquals(1, solution.maxRepOpt1("abcdef"));
    }

}