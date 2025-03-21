package com.huhu.algorithm.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BatchSpliterator<T> implements Spliterator<List<T>> {

    private final int size;
    private final Spliterator<T> source;

    public BatchSpliterator(int size, Spliterator<T> source) {
        this.size = size;
        this.source = source;
    }

    @Override
    public boolean tryAdvance(Consumer<? super List<T>> action) {
        List<T> batch = new ArrayList<>(size);
        while (batch.size() < size) {
            if (!source.tryAdvance(batch::add)) {
                break;
            }
        }
        if (batch.size() != size) {
            return false;
        }
        action.accept(batch);
        return true;
    }

    @Override
    public Spliterator<List<T>> trySplit() {
        if ((source.characteristics() & Spliterator.CONCURRENT) == 0) {
            return null;
        }
        Spliterator<T> split = source.trySplit();
        if (split == null) {
            return null;
        }
        return new BatchSpliterator<>(size, split);
    }

    @Override
    public long estimateSize() {
        long srcSize = source.estimateSize();
        if (srcSize == Long.MAX_VALUE) {
            return srcSize;
        }
        return (srcSize + size - 1) / size;
    }

    @Override
    public int characteristics() {
        return source.characteristics();
    }

}
