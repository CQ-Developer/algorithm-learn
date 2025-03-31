package com.huhu.algorithm.learn.solution.n2841;

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
        List<Integer> nums = List.of(2, 6, 7, 3, 1, 7);
        assertEquals(18, solution.maxSum(nums, 3, 4));
    }

    @Test
    void testB() {
        List<Integer> nums = List.of(5, 9, 9, 2, 4, 5, 4);
        assertEquals(23, solution.maxSum(nums, 1, 3));
    }

    @Test
    void testC() {
        List<Integer> nums = List.of(1, 2, 1, 2, 1, 2, 1);
        assertEquals(0, solution.maxSum(nums, 3, 3));
    }

    @Test
    void testD() {
        List<Integer> nums = List.of(996021492, 996021492, 973489433, 66259330, 554129007, 713784351, 646092981, 328987029, 469368828, 685679486, 66259330, 165954500, 731567840, 595800464, 552439059, 14673238, 157622945, 521321042, 386913607, 733723177, 330475939, 462727944, 69696035, 958945846, 648914457, 627088742, 363551051, 50748590, 400980660, 674779765, 439950964, 613843311, 385212079, 725525766, 813504429, 385212079, 66563232, 578031878, 935017574, 554725813, 456892672, 245308625, 626768145, 270964388, 554725813, 768296675, 676923124, 939689721, 115905765, 625193590, 717796816, 27972217, 277242430, 768296675, 480860474, 659230631, 570682291, 601689140, 955632265, 767424000, 251696645, 675750691, 767424000, 251696645, 767424000, 675750691, 675750691, 251696645);
        assertEquals(5081057906L, solution.maxSum(nums, 8, 8));
    }

}