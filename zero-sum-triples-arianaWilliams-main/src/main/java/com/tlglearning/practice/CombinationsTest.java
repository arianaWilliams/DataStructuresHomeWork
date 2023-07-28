package com.tlglearning.practice;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CombinationsTest {

    @Test
    public void zeroSumTriples() {
        int[] input = {1, -2, 2, 5, 3, 0, -4, -1};
        Set<Set<Integer>> expected = new HashSet<>(Arrays.asList(
                new HashSet<>(Arrays.asList(1, 3, -4)),
                new HashSet<>(Arrays.asList(1, 0, -1)),
                new HashSet<>(Arrays.asList(-2, 2, 0)),
                new HashSet<>(Arrays.asList(-2, 3, -1)),
                new HashSet<>(Arrays.asList(5, -4, -1))
        ));

        Set<? extends Set<Integer>> actual = Combinations.zeroSumTriples(input);
        assertEquals(expected, actual);
    }

    @Test
    public void zeroSumTriplesLargerDataSet() {
        int[] input = {7, 10, 2, -4, -7, 9, -6, -8, 8, 6, -10, -9, 5, 4, -2, -1, -5, 3};
        Set<Set<Integer>> expected = new HashSet<>(Arrays.asList(
                new HashSet<>(Arrays.asList(7, 2, -9)),
                new HashSet<>(Arrays.asList(7, -6, -1)),
                new HashSet<>(Arrays.asList(7, -10, 3)),
                new HashSet<>(Arrays.asList(7, -2, -5)),
                new HashSet<>(Arrays.asList(10, -4, -6)),
                new HashSet<>(Arrays.asList(10, -8, -2)),
                new HashSet<>(Arrays.asList(10, -9, -1)),
                new HashSet<>(Arrays.asList(2, -7, 5)),
                new HashSet<>(Arrays.asList(2, -6, 4)),
                new HashSet<>(Arrays.asList(2, -8, 6)),
                new HashSet<>(Arrays.asList(2, 8, -10)),
                new HashSet<>(Arrays.asList(2, -5, 3)),
                new HashSet<>(Arrays.asList(-4, 9, -5)),
                new HashSet<>(Arrays.asList(-4, 6, -2)),
                new HashSet<>(Arrays.asList(-4, 5, -1)),
                new HashSet<>(Arrays.asList(-7, 9, -2)),
                new HashSet<>(Arrays.asList(-7, 8, -1)),
                new HashSet<>(Arrays.asList(-7, 4, 3)),
                new HashSet<>(Arrays.asList(9, -8, -1)),
                new HashSet<>(Arrays.asList(-6, 8, -2)),
                new HashSet<>(Arrays.asList(-8, 5, 3)),
                new HashSet<>(Arrays.asList(6, -10, 4)),
                new HashSet<>(Arrays.asList(6, -9, 3)),
                new HashSet<>(Arrays.asList(6, -1, -5)),
                new HashSet<>(Arrays.asList(-9, 5, 4)),
                new HashSet<>(Arrays.asList(-2, -1, 3))

        ));

        Set<? extends Set<Integer>> actual = Combinations.zeroSumTriples(input);
        assertEquals(expected, actual);
    }
}