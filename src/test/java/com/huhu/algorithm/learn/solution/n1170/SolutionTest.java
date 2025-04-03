package com.huhu.algorithm.learn.solution.n1170;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        String[] queries = {"cbd"}, words = {"zaaaz"};
        int[] result = {1};
        assertArrayEquals(result, solution.numSmallerByFrequency(queries, words));
    }

    @Test
    void test_b() {
        String[] queries = {"bbb", "cc"}, words = {"a", "aa", "aaa", "aaaa"};
        int[] result = {1, 2};
        assertArrayEquals(result, solution.numSmallerByFrequency(queries, words));
    }

}