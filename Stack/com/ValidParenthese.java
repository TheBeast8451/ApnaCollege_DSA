
import java.util.Stack;

public class ValidParenthese {

    public static boolean validParent(String st) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            char curr = st.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                s.push(curr);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && curr == ')')
                        || (s.peek() == '{' && curr == '}')
                        || (s.peek() == '[' && curr == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }

        }

        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String st = "({})]";
        System.out.println(validParent(st));
    }
}
