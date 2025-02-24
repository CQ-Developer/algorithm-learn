package com.huhu.algorithm.learn.n2781;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        assertEquals(4, solution.longestValidSubstring("cbaaaabc", List.of("aaa", "cb")));
    }

    @Test
    void testB() {
        assertEquals(4, solution.longestValidSubstring("leetcode", List.of("de", "le", "e")));
    }

}
