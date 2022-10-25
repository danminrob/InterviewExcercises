package main.java.veryeasy;

/*
Reverse the string word by word.
 */
public class ReverseTheString {

    public static void testCases() {
        String text = "the sky is blue";
        System.out.printf("Expected: %s - Result: %s%n", "blue is sky the", reverseTheString(text));
        text = "this is ib";
        System.out.printf("Expected: %s - Result: %s%n", "ib is this", reverseTheString(text));

    }

    private static String reverseTheString(String text) {
        String[] words = text.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }
}
