
public class PartitionList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node partition(Node head, int x) {
        Node smallDummy = new Node(0);
        Node bigDummy = new Node(0);
        Node small = smallDummy;
        Node big = bigDummy;
        Node curr = head;
        while (curr != null) {
            if (curr.data < x) {
                small.next = curr;
                small = small.next;
            } else {
                big.next = curr;
                big = big.next;
            }
            curr = curr.next;
        }
        big.next = null;
        small.next = bigDummy.next;
        return smallDummy.next;
    }

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

        // 1 → 4 → 3 → 2 → 5 → 2
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        System.out.println("Original List:");
        printList(head);

        int x = 3;

        head = partition(head, x);

        System.out.println("After Partition around " + x + ":");
        printList(head);
    }
}
