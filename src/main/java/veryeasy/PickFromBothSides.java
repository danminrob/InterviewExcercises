package main.java.veryeasy;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an integer array A of size N.

You have to pick exactly B elements from either left or right end of the array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4 and array A contains 10 elements then

    You can pick the first four elements or can pick the last four elements or can pick 1 from the front and 3 from the back etc. you need to return the maximum possible sum of elements you can pick.

 */
public class PickFromBothSides {

    public static void testCases() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5, -2, 3, 1, 2));
        String expected = "8";
        int result = pickFromBothSides(array, 3);
        System.out.printf("Expected: %s - Result: %s%n", expected, result);

        array = new ArrayList<>(Arrays.asList(1, 2));
        expected = "2";
        result = pickFromBothSides(array, 1);
        System.out.printf("Expected: %s - Result: %s%n", expected, result);
    }

    public static int pickFromBothSides(ArrayList<Integer> array, int nToSum) {
        int res = Integer.MIN_VALUE;
        for (int i = 0, izq = nToSum - 1, der = 0; i <= nToSum; i++, izq--, der++) {
            int run = 0;
            for (int j = izq; j >= 0; j--) {
                run += array.get(j);
            }
            for (int j = der; j > 0; j--) {
                run += array.get(array.size() - j);
            }
            res = Math.max(res, run);
        }
        return res;
    }
}
