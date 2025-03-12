package com.huhu.algorithm.learn.n159;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class SolutionTest {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        assertEquals(3, solution.lengthOfLongestSubstringTwoDistinct("eceba"));
    }

    @Test
    void test_b() {
        assertEquals(5, solution.lengthOfLongestSubstringTwoDistinct("ccaabbb"));
    }

    abstract Solution getSolution();

}