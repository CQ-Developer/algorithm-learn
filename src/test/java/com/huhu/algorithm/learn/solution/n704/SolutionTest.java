package com.huhu.algorithm.learn.solution.n704;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        Assertions.assertEquals(4, solution.search(nums, 9));
    }

    @Test
    void test_b() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        Assertions.assertEquals(-1, solution.search(nums, 2));
    }

}