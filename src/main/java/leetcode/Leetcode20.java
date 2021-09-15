package leetcode;

import java.util.Queue;
import java.util.Stack;

public class Leetcode20 {
    // 栈实现匹配括号
    public Boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(c);
            } else {
                if (c == ' ') {
                    return false;
                }
                char topChar = stack.pop();
                if (c == ')' && topChar != '(') {
                    return false;
                }
                if (c == '}' && topChar != '{') {
                    return false;
                }

                if (c == ']' && topChar != '[') {
                    return false;
                }


            }


        }
        return stack.isEmpty();
    }
}