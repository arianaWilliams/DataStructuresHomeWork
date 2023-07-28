package com.tlglearning.practice;

import static org.junit.Assert.*;

public class SquareTest {

    @org.junit.Test
    public void isPerfectSquare() {
        long[] testCases = {0, 4096, 428135971041L, 2, 4097, 428135971042L};
        boolean[] expected = {true, true, true, false, false, false};
        for(int i = 0; i < testCases.length; i++){
            boolean actual = Square.isPerfectSquare(testCases[i]);
            assertEquals(expected[i], actual);
        }
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void perfectSquareOutOfBounds() {
        boolean actual = Square.isPerfectSquare(-1);
    }


}