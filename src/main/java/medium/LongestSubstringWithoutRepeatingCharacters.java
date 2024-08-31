package main.java.medium;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Given a string s, find the length of the longest
substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void testCases() {
        String input = "abcabcbb";
        int expected = 3;
        customAssert(input, expected);

        input = "bbbbb";
        expected = 1;
        customAssert(input, expected);

        input = "pwwkew";
        expected = 3;
        customAssert(input, expected);

        input = "";
        expected = 0;
        customAssert(input, expected);

        input = " ";
        expected = 1;
        customAssert(input, expected);

        input = "dvdf";
        expected = 3;
        customAssert(input, expected);
    }

    private static void customAssert(String input, int expected) {
        int result = lengthOfLongestSubstring2(input);
        if (result != expected) {
            throw new AssertionError("Wrong length. Expected: " + expected + " Result: " + result);
        }
    }

    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] characters = s.toCharArray();
        int longestSubstring = 0;
        int currentSubstring = 0;
        Map<Character, Boolean> usedCharacters = new HashMap<>();
        for(int j = 0; j < (characters.length - longestSubstring); j++) {
            for(int i = j; i < characters.length ; i++) {
                Character c = characters[i];
                if(!usedCharacters.containsKey(c)){
                    usedCharacters.put(c, true);
                    currentSubstring++;
                } else {
                    break;
                }
            }
            longestSubstring = Math.max(currentSubstring, longestSubstring);
            currentSubstring = 0;
            usedCharacters = new HashMap<>();
        }
        return longestSubstring;
    }
}
