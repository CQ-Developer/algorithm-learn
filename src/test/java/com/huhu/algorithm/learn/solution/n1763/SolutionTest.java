package com.huhu.algorithm.learn.solution.n1763;

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
        assertEquals("aAa", solution.longestNiceSubstring("YazaAay"));
    }

    @Test
    void test_b() {
        assertEquals("Bb", solution.longestNiceSubstring("Bb"));
    }

    @Test
    void test_c() {
        assertEquals("", solution.longestNiceSubstring("c"));
    }

    @Test
    void test_d() {
        assertEquals("dD", solution.longestNiceSubstring("dDzeE"));
    }

}