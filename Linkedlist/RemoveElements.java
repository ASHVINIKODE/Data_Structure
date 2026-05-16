
public class RemoveElements {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Remove elements function
    static Node removeElements(Node head, int val) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node curr = dummy;

        while (curr.next != null) {

            if (curr.next.data == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }

    // Print list
    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        // 1 → 2 → 6 → 3 → 4 → 5 → 6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(6);

        System.out.println("Original List:");
        printList(head);

        int val = 6;

        head = removeElements(head, val);

        System.out.println("After Removing " + val + ":");
        printList(head);
    }
}
