import java.util.ArrayList;

class StackAL {
    static ArrayList<Integer> list = new ArrayList<>();

    static class StackDemo {

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            return top;
        }
    }

    public static void main(String[] args) {
        StackDemo st = new StackDemo();
        st.push(1);
        st.push(2);
        st.push(3);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}