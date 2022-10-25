package main.java.easy;

import java.util.HashMap;

/*
Given a roman numeral, convert it to an integer.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
 */
public class RomanToInt {

    public static void testCases() {
        String s = "III";
        int expected = 3;
        System.out.printf("Expected: %s - Result: %s%n", expected, romanToInt(s));

        s = "LVIII";
        expected = 58;
        System.out.printf("Expected: %s - Result: %s%n", expected, romanToInt(s));

        s = "MCMXCIV";
        expected = 1994;
        System.out.printf("Expected: %s - Result: %s%n", expected, romanToInt(s));
    }

    private static int romanToInt(String s) {
        int res = 0;
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        for (int i = 0, times = 1; i < chars.length; i++) {
            if (i > 0 && values.get(chars[i - 1]).equals(values.get(chars[i]))) {
                times++;
            }
            if (i > 0 && values.get(chars[i - 1]) < values.get(chars[i])) {
                res += values.get(chars[i]) - (values.get(chars[i - 1]) * times);
                times = 1;
            } else if (i == chars.length - 1 || values.get(chars[i]) > values.get(chars[i + 1])) {
                res += values.get(chars[i]) * times;
                times = 1;
            }
        }
        return res;
    }
}
