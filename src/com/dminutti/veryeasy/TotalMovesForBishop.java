package com.dminutti.veryeasy;

/*
Given the position of a Bishop (A, B) on an 8 * 8 chessboard.

Your task is to count the total number of squares that can be visited by the Bishop in one move.
 */
public class TotalMovesForBishop {

    public static void testCases() {
        String expected = "11";
        int result = totalMovesForBishop(3, 4);
        System.out.printf("Expected: %s - Result: %s%n", expected, result);

        expected = "13";
        result = totalMovesForBishop(4, 4);
        System.out.printf("Expected: %s - Result: %s%n", expected, result);

        expected = "7";
        result = totalMovesForBishop(1, 1);
        System.out.printf("Expected: %s - Result: %s%n", expected, result);
    }

    public static int totalMovesForBishop(int row, int col) {
        return Math.min(row-1, col-1) + Math.min(row-1, 8-col) + Math.min(8-row, col-1) + Math.min(8-row, 8-col);
    }
}
