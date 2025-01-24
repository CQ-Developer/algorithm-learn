package com.huhu.algorithm.learn.n1456;

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
    void testA() {
        assertEquals(3, solution.maxVowels("abciiidef", 3));
    }

    @Test
    void testB() {
        assertEquals(2, solution.maxVowels("aeiou", 2));
    }

    @Test
    void testC() {
        assertEquals(2, solution.maxVowels("leetcode", 3));
    }

    @Test
    void testD() {
        assertEquals(1, solution.maxVowels("tryhard", 4));
    }

}
