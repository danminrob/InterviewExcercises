package com.dminutti.veryeasy;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an sorted array A of size N. Find number of elements which are less than or equal to B.

NOTE: Expected Time Complexity O(log N)
 */
public class SmallerOrEqualElements {

    public static void testCases() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,3,6,8,10,13,13,15,15,16,18,40,41,55,56));
        String expected = "7";
        int result = smallerOrEqualElements(array, 13);
        System.out.printf("Expected: %s - Result: %s%n", expected, result);
    }

    private static int smallerOrEqualElements(ArrayList<Integer> list, int let) {
        int matches = 0;
        for (Integer i : list) {
            if (i>let) {
                break;
            }
            matches++;
        }
        return matches;
    }
}
