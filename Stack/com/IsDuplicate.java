import java.util.Stack;

public class IsDuplicate {

    public static boolean isValidDuplicate(String st) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            char curr = st.charAt(i);
            if (curr == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    count++;
                    s.pop();
                }

                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }

            } else {
                s.push(curr);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String st1 = "(((a+b)) +(c+d))";
        String st2 = "((a+b))";
        System.out.println(isValidDuplicate(st2));
    }
}
