package com.huhu.algorithm.learn.solution.n3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getInstance();

    @BeforeEach
    void setup() {
        solution = getInstance();
    }

    @Test
    void testA() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void testB() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void testC() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void testD() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void testE() {
        assertEquals(5, solution.lengthOfLongestSubstring("tmmzuxt"));
    }

    @Test
    void testF() {
        assertEquals(5, solution.lengthOfLongestSubstring("qrsvbspk"));
    }

}
