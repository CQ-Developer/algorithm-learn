package com.huhu.algorithm.learn.n2962;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// - 1 <= nums.length <= 10<sup>5</sup>
/// - 1 <= nums\[i\] <= 10<sup>6</sup>
/// - 1 <= k <= 10<sup>5</sup>
abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        int[] nums = {1, 3, 2, 3, 3};
        assertEquals(6, solution.countSubarrays(nums, 2));
    }

    @Test
    void test_b() {
        int[] nums = {1, 4, 2, 1};
        assertEquals(0, solution.countSubarrays(nums, 3));
    }

}