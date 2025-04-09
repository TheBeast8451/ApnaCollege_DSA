public class StackLL {

    static class LinkedLL {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;

        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int data = head.data;
            return data;

        }
    }

    public static void main(String[] args) {
        LinkedLL ll = new LinkedLL();
        ll.push(1);
        ll.push(2);
        ll.push(3);

        while (!ll.isEmpty()) {
            System.out.println(ll.peek());
            ll.pop();
        }
    }
}
