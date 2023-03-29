package leetcode;

import java.util.Stack;

public class _0020_ValidParentheses {

    public static void main(String[] args) {

        Boolean test1 = new _0020_ValidParentheses().isValid("()");
        System.out.println(test1);
        Boolean test2 = new _0020_ValidParentheses().isValid("(]");
        System.out.println(test2);
    }

    public boolean isValid(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
