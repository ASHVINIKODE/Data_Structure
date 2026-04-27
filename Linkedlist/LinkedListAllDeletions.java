
public class LinkedListAllDeletions {

    // Node class
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class
    static class LinkedList {

        Node head;

        // ---------- Delete from Beginning ----------
        void deleteFromBeginning() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            head = head.next;
        }

        // ---------- Delete from End ----------
        void deleteFromEnd() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            // Only one node
            if (head.next == null) {
                head = null;
                return;
            }

            Node temp = head;

            // Reach second last node
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
        }

        // ---------- Delete at Position ----------
        void deleteAtPosition(int pos) {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            // Delete first node
            if (pos == 1) {
                head = head.next;
                return;
            }

            Node temp = head;
            int i = 1;

            // Move to (pos - 1)
            while (temp != null && i < pos - 1) {
                temp = temp.next;
                i++;
            }

            // Invalid position
            if (temp == null || temp.next == null) {
                System.out.println("Invalid position");
                return;
            }

            temp.next = temp.next.next;
        }

        // ---------- Delete by Value ----------
        void deleteByValue(int key) {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            // Delete head
            if (head.data == key) {
                head = head.next;
                return;
            }

            Node temp = head;

            while (temp.next != null && temp.next.data != key) {
                temp = temp.next;
            }

            if (temp.next == null) {
                System.out.println("Value not found");
                return;
            }

            temp.next = temp.next.next;
        }

        // ---------- Traverse ----------
        void traverse() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            System.out.println("null");
        }
    }

    // ---------- Main Method ----------
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Create list
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);

        System.out.print("Original List: ");
        list.traverse();

        // Delete from beginning
        list.deleteFromBeginning();
        System.out.print("After delete from beginning: ");
        list.traverse();

        // Delete from end
        list.deleteFromEnd();
        System.out.print("After delete from end: ");
        list.traverse();

        // Delete at position 2
        list.deleteAtPosition(2);
        System.out.print("After delete at position 2: ");
        list.traverse();

        // Delete by value 20
        list.deleteByValue(20);
        System.out.print("After delete value 20: ");
        list.traverse();
    }
}
