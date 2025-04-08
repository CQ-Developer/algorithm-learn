package com.huhu.algorithm.learn.solution.n1146;

class AooTest extends SnapshotArrayTest {

    @Override
    SnapshotArray getSnapshotArray(int length) {
        return new Aoo(length);
    }

}