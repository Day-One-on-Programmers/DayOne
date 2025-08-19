package com.back.week02;

import java.util.Stack;

public class M10 {
    public static void main(String[] args) {
        String str = "()()";

    }

    public static boolean main(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (stack.isEmpty() || c == '(')
                stack.push(c);
            else {
                if (stack.pop() == ')')
                    return false;
            }

        }
        return stack.isEmpty();
    }
}
