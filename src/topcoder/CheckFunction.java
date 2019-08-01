package topcoder;

import java.util.HashMap;

public class CheckFunction {
    private static final HashMap<Character, Integer> values = new HashMap<>();
    static {
        values.put('0', 6);
        values.put('1', 2);
        values.put('2', 5);
        values.put('3', 5);
        values.put('4', 4);
        values.put('5', 5);
        values.put('6', 6);
        values.put('7', 3);
        values.put('8', 7);
        values.put('9', 6);
    }
    public static int newFunction(String code) {
        int result = 0;
        for (int i = 0; i < code.length(); i++) {
            result += values.get(code.charAt(i));
        }
        return result;
    }

}
