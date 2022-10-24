package easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class OpeningAndClosingBrackets {

    public static void testCases(){
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
        Map<Character,Character> pairs = new HashMap();
        pairs.put('[',']');
        pairs.put('{','}');
        pairs.put('(',')');
        Deque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < textToAnalyze.length(); i++) {
            Character current = textToAnalyze.charAt(i);
            if (pairs.containsKey(current)) {
                queue.push(current);
            }
            if (pairs.containsValue(current)) {
                if (queue.peek() == null) {
                    return false;
                }
                if (pairs.get(queue.peek()).equals(current)){
                    queue.pop();
                } else {
                    return false;
                }
            }
        }
        return queue.isEmpty();
    }

}
