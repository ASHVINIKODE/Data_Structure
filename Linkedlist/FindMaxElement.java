
public class FindMaxElement {

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

        int findMax(Node head) {
            if (head == null) {
                System.out.println("List is empty");
                return -1;
            }
            int max = head.data;
            Node temp = head;
            while (temp != null) {
                if (temp.data > max) {
                    max = temp.data;
                }
                temp = temp.next;
            }
            return max;
        }

        void traverse() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(12);
        list.head.next = new Node(45);
        list.head.next.next = new Node(7);
        list.head.next.next.next = new Node(89);
        list.head.next.next.next.next = new Node(23);
        list.traverse();
        System.out.println();
        int result = list.findMax(list.head);
        System.out.println("Maximum Element: " + result);
    }
}
