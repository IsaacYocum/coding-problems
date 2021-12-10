package problems.leetcode._11_20;

import java.util.Stack;

public class _20_ValidParentheses {
    public static void main(String[] args) {
        String test = "()[]{}";
        String test1 = "()";
        System.out.println(isValid(test1));
    }

    // O(n)
    // O(n), worst case is O(n/2), best case is O(1)
    public static boolean isValid(String s) {
        if (s.length() < 2) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }

            if (stack.empty()) return false;

            switch (s.charAt(i)) {
                case (')'):
                    if (stack.pop() != '(') return false;
                    break;
                case (']'):
                    if (stack.pop() != '[') return false;
                    break;
                case ('}'):
                    if (stack.pop() != '{') return false;
                    break;
            }
        }

        return stack.empty();
    }
}
