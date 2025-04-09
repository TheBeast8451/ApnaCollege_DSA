package PracticeProblems;

import java.util.Stack;

public class StackStringReverse {

    public static String reverseString(String st) {
        int idx = 0;
        Stack<Character> stack = new Stack<>();
        while (idx < st.length()) {
            stack.push(st.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            Character sum = stack.pop();
            sb.append(sum);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String st = "abc";
        System.out.println(reverseString(st));
    }
}
