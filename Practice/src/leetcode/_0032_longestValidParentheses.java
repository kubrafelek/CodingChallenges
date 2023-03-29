package leetcode;

import java.util.Stack;

public class _0032_longestValidParentheses {
    public static void main(String[] args) {
        String t1 = "()(())";
        t1 = "(()";
        t1 = ")()())";
    }

    public static int longestValidParentheses(String s) {
        if (s == null || s.length() < 2) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.empty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }

        int maxLength = 0;
        int endTerminal = s.length();

        while (!stack.isEmpty()) {
            int startTerminal = stack.pop();
            maxLength = Math.max(maxLength, endTerminal - startTerminal - 1);
            endTerminal = startTerminal;
        }

        return Math.max(endTerminal, maxLength);
    }
}
