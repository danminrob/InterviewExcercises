package main.java.easy;

public class FunWithVowels {

    public static void testCases() {
        String testCase = "aeiou";
        int expectedResult = 5;
        customAssert(testCase, expectedResult);

        testCase = "aeiaaeeiioouuaei";
        expectedResult = 10;
        customAssert(testCase, expectedResult);

        testCase = "aeiaei";
        expectedResult = 0;
        customAssert(testCase, expectedResult);

        testCase = "aeieiou";
        expectedResult = 0;
        customAssert(testCase, expectedResult);
    }

    private static void customAssert(String input, int expected) {
        int result = funWithVowels(input);
        if (result != expected) {
            throw new AssertionError("Wrong. Expected: " + expected + " Result: " + result);
        }
    }

    private static int funWithVowels(String s) {
        int longestCount = 0;
        int count = 0;
        int vPos = 0;
        char[] vowels = "aeiou".toCharArray();

        for (char c : s.toCharArray()) {
            if (c == vowels[vPos]) {
                count++;
            } else if (vowels[vPos] != 'u' && c == vowels[vPos + 1]) {
                count++;
                vPos++;
            } else if (vowels[vPos] != 'u') {
                count = 1;
                vPos = 0;
            }

            if (vowels[vPos] == 'u') {
                longestCount = Math.max(count, longestCount);
            }

        }

        return longestCount;
    }
}
