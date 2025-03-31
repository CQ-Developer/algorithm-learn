package com.huhu.algorithm.learn.solution.n1695;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class SolutionTest {

    Solution alg;

    abstract Solution getInstance();

    @BeforeEach
    void setup() {
        alg = getInstance();
    }

    @Test
    void test1() {
        int[] nums = {4, 2, 4, 5, 6};
        assertEquals(17, alg.maximumUniqueSubarray(nums));
    }

    @Test
    void test2() {
        int[] nums = {5, 2, 1, 2, 5, 2, 1, 2, 5};
        assertEquals(8, alg.maximumUniqueSubarray(nums));
    }

}
