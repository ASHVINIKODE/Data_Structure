
public class UpdateFirstOccurence {

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

        void update(Node head, int oldVal, int newVal) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == oldVal) {
                    temp.data = newVal;
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Value not found");
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
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(50);
        System.out.println("Orginal list");
        list.traverse();
        System.out.println();
        list.update(list.head, 10, 11);
        System.out.println("Updated list:");
        list.traverse();
    }
}
