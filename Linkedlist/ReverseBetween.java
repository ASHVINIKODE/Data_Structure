
public class ReverseBetween {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node reverseBetween(Node head, int left, int right) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        Node curr = prev.next;
        for (int i = 0; i < right - left; i++) {
            Node next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }

    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // 1 → 2 → 3 → 4 → 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        int left = 2;
        int right = 4;

        head = reverseBetween(head, left, right);

        System.out.println("After Reversing from " + left + " to " + right + ":");
        printList(head);
    }
}
