package com.huhu.algorithm.learn.solution.n1146;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class SnapshotArrayTest {

    abstract SnapshotArray getSnapshotArray(int length);

    @Test
    void test_a() {
        var solution = getSnapshotArray(3);
        solution.set(0, 5);
        assertEquals(0, solution.snap());
        solution.set(0, 6);
        assertEquals(5, solution.get(0, 0));
    }

}