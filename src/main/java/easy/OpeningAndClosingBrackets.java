package main.java.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class OpeningAndClosingBrackets {

    public static void testCases() {
        String text = "{a{b{c}}}";
        System.out.println("Expected: true - Result: " + openingAndClosingBrackets(text));
        text = "{a{b{c}}}}";
        System.out.println("Expected: false - Result: " + openingAndClosingBrackets(text));
        text = "{a{b{c]}}";
        System.out.println("Expected: false - Result: " + openingAndClosingBrackets(text));
        text = "{a(b[c]asdfas)-+=$%^}";
        System.out.println("Expected: true - Result: " + openingAndClosingBrackets(text));
    }

    private static boolean openingAndClosingBrackets(String textToAnalyze) {
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('[', ']');
        pairs.put('{', '}');
        pairs.put('(', ')');
        Queue<Character> queue = new PriorityQueue<>();
        for (int i = 0; i < textToAnalyze.length(); i++) {
            Character current = textToAnalyze.charAt(i);
            if (pairs.containsKey(current)) {
                queue.add(current);
            }
            if (pairs.containsValue(current)) {
                if (queue.peek() == null) {
                    return false;
                }
                if (pairs.get(queue.peek()).equals(current)) {
                    queue.poll();
                } else {
                    return false;
                }
            }
        }
        return queue.isEmpty();
    }

}
