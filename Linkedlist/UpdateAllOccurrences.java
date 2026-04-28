public class UpdateAllOccurrences {

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

        // Function to update all occurrences
        void updateAll(Node head, int oldVal, int newVal) {
            Node temp = head;
            boolean found = false;

            while (temp != null) {
                if (temp.data == oldVal) {
                    temp.data = newVal;
                    found = true;
                }
                temp = temp.next;
            }

            if (!found) {
                System.out.println("Value not found");
            }
        }

        // Traverse
        void traverse() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // Main method
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Creating list
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(20);

        System.out.print("Original list: ");
        list.traverse();

        // Update all 20 → 99
        list.updateAll(list.head, 20, 99);

        System.out.print("Updated list: ");
        list.traverse();
    }
}