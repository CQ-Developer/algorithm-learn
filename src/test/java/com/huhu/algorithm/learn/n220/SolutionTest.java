package com.huhu.algorithm.learn.n220;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertFalse;
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
    void testD() throws Exception {
        var uri = Thread.currentThread()
                .getContextClassLoader()
                .getResource(SolutionTest.class.getPackageName().replaceAll("\\.", "/") + "/testD")
                .toURI();
        int[] nums = Files.lines(Path.of(uri))
                .mapToInt(Integer::parseInt)
                .toArray();
        assertFalse(solution.containsNearbyAlmostDuplicate(nums, 10000, 0));
    }

}