package com.huhu.algorithm.learn.solution.n981;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class TimeMapTest {

    TimeMap timeMap;

    abstract TimeMap getTimeMap();

    @BeforeEach
    void setup() {
        timeMap = getTimeMap();
    }

    @Test
    void test_a() {
        timeMap.set("foo", "bar", 1);
        assertEquals("bar", timeMap.get("foo", 1));
        assertEquals("bar", timeMap.get("foo", 3));
        timeMap.set("foo", "bar2", 4);
        assertEquals("bar2", timeMap.get("foo", 4));
        assertEquals("bar2", timeMap.get("foo", 5));
    }

}