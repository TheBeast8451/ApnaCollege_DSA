package PracticeProblems;

import java.util.Stack;

public class NextGreater {
    public static void findNextGreater(int arr[], int nextGreat[]) {
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nextGreat[i] = -1;
            } else {
                nextGreat[i] = arr[st.peek()];
            }

            st.push(i);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreat[] = new int[arr.length];
        findNextGreater(arr, nextGreat);
        for (int i = 0; i < nextGreat.length; i++) {
            System.out.print(nextGreat[i] + " ");
        }
    }
}
