package com.huhu.algorithm.learn.solution.n1610;

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
        var points = List.of(List.of(2, 1), List.of(2, 2), List.of(3, 3));
        var location = List.of(1, 1);
        assertEquals(3, solution.visiblePoints(points, 90, location));
    }

    @Test
    void testB() {
        var points = List.of(List.of(2, 1), List.of(2, 2), List.of(3, 4), List.of(1, 1));
        var location = List.of(1, 1);
        assertEquals(4, solution.visiblePoints(points, 90, location));
    }

    @Test
    void testC() {
        var points = List.of(List.of(1, 0), List.of(2, 1));
        var location = List.of(1, 1);
        assertEquals(1, solution.visiblePoints(points, 13, location));
    }

}