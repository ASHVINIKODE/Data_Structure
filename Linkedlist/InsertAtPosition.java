
public class InsertAtPosition {

    // Node class
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {

        Node head;

        void insertAtPosition(int value, int pos) {
            Node newNode = new Node(value);
            if (pos == 1) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            int i = 1;
            while (temp != null && i < pos - 1) {
                temp = temp.next;
                i++;
            }
            if (temp == null) {
                System.out.println("Invalid Position");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }

        void traverse() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {

            LinkedList list = new LinkedList();

            list.insertAtPosition(10, 1);
            list.insertAtPosition(20, 2);
            list.insertAtPosition(40, 3);

            list.insertAtPosition(30, 3);

            list.traverse();
        }
    }
}
