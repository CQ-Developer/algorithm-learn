package com.huhu.algorithm.learn.solution.n1146;

class BooTest extends SnapshotArrayTest {

    @Override
    SnapshotArray getSnapshotArray(int length) {
        return new Boo(length);
    }

}