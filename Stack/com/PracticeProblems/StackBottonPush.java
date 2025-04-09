package PracticeProblems;

import java.util.Stack;

public class StackBottonPush {

    public static void pushAtBottom(int data, Stack<Integer> st) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(data, st);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverseStack(st);
        pushAtBottom(top, st);

    }

    public static void main(String[] args) {
        Stack<Integer> ll = new Stack<>();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        // pushAtBottom(6, ll);
        reverseStack(ll);
        while (!ll.isEmpty()) {
            System.out.println(ll.peek());
            ll.pop();
        }
    }
}
