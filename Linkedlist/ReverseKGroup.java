public class ReverseKGroup {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Reverse nodes in groups of k
    static Node reverseKGroup(Node head, int k) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        while (true) {

            // Find kth node
            Node kth = prev;

            for (int i = 0; i < k; i++) {

                if (kth.next == null) {
                    return dummy.next;
                }

                kth = kth.next;
            }

            // Start reversing
            Node curr = prev.next;
            Node next = curr.next;

            for (int i = 1; i < k; i++) {

                curr.next = next.next;

                next.next = prev.next;

                prev.next = next;

                next = curr.next;
            }

            // Move prev forward
            prev = curr;
        }
    }

    // Print linked list
    static void print(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Create linked list
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        int k = 3;

        System.out.println("Original List:");
        print(head);

        head = reverseKGroup(head, k);

        System.out.println("After Reversing in Group of " + k + ":");
        print(head);
    }
}