package com.huhu.algorithm.learn.solution.n438;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void testA() {
        assertIterableEquals(List.of(0, 6), solution.findAnagrams("cbaebabacd", "abc"));
    }

    @Test
    void testB() {
        assertIterableEquals(List.of(0, 1, 2), solution.findAnagrams("abab", "ab"));
    }

}
