package com.huhu.algorithm.learn.solution.n1150;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        assertTrue(solution.isMajorityElement(new int[]{2, 4, 5, 5, 5, 5, 5, 6, 6}, 5));
    }

    @Test
    void test_b() {
        assertFalse(solution.isMajorityElement(new int[]{10, 100, 101, 101}, 101));
    }

    @ParameterizedTest
    @MethodSource("generate")
    void test_c(int[] nums, int target, boolean res) {
        assertEquals(res, solution.isMajorityElement(nums, target));
    }

    static Stream<Arguments> generate() {
        var gen = RandomGeneratorFactory.of("L128X1024MixRandom").create(System.nanoTime());
        return IntStream.iterate(0, i -> i < 1000, i -> i + 1)
                .mapToObj(i -> {
                    int[] nums = gen.ints(gen.nextInt(1, 1001), 1, 1000000001).toArray();
                    int target = gen.nextInt(1, 1000000001);
                    boolean res = new Answer().isMajorityElement(nums, target);
                    return Arguments.arguments(nums, target, res);
                });
    }

}