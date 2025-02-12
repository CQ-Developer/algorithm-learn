package com.huhu.algorithm.learn.n220;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ClassLoaderUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getInstance();

    @BeforeEach
    void setup() {
        solution = getInstance();
    }

    @Test
    void testA() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsNearbyAlmostDuplicate(nums, 3, 0));
    }

    @Test
    void testB() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        assertFalse(solution.containsNearbyAlmostDuplicate(nums, 2, 3));
    }

    @Test
    void testC() {
        int[] nums = {2, 2};
        assertTrue(solution.containsNearbyAlmostDuplicate(nums, 2, 0));
    }

    @Test
    void testD() {
        var input = ClassLoaderUtils.getDefaultClassLoader()
                .getResourceAsStream("com/huhu/algorithm/learn/n220/testD");
        assertNotNull(input);
        int[] nums = new BufferedReader(new InputStreamReader(input))
                .lines()
                .mapToInt(Integer::parseInt)
                .toArray();
        assertFalse(solution.containsNearbyAlmostDuplicate(nums, 10000, 0));
    }

}