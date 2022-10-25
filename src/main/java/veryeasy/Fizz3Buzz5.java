package main.java.veryeasy;

import java.util.ArrayList;

/*
Given a positive integer A, return an array of strings with all the integers from 1 to N.

But for multiples of 3 the array should have “Fizz” instead of the number.

For the multiples of 5, the array should have “Buzz” instead of the number.

For numbers which are multiple of 3 and 5 both, the array should have “FizzBuzz” instead of the number.
 */
public class Fizz3Buzz5 {

    public static void testCases() {
        int n = 5;
        String expected = "[1 2 Fizz 4 Buzz]";
        ArrayList<String> result = fizzBuzz(n);
        System.out.printf("Expected: %s - Result: %s%n", expected, result);
        n = 15;
        expected = "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]";
        result = fizzBuzz(n);
        System.out.printf("Expected: %s - Result: %s%n", expected, result);
    }

    private static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    res.add("FizzBuzz");
                } else {
                    res.add("Fizz");
                }
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
