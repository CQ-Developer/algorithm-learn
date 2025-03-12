package com.huhu.algorithm.learn.n2904;

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
        assertEquals("11001", solution.shortestBeautifulSubstring("100011001", 3));
    }

    @Test
    void test_b() {
        assertEquals("11", solution.shortestBeautifulSubstring("1011", 2));
    }

    @Test
    void test_c() {
        assertEquals("", solution.shortestBeautifulSubstring("000", 1));
    }

    @Test
    void test_d() {
        assertEquals("11101111001", solution.shortestBeautifulSubstring("1100001110111100100", 8));
    }

}