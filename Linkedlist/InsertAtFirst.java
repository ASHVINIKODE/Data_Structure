
public class InsertAtFirst {

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

        void insertAtFirst(int value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }

        void traverse() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("Null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(20);
        list.head.next = new Node(60);
        list.head.next.next = new Node(90);
        list.insertAtFirst(590);
        list.insertAtFirst(30);
        list.insertAtFirst(29);
        list.insertAtFirst(10);
        list.traverse();
    }
}
