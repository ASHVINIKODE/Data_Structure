
public class MergeKLists {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }
        return dummy.next;
    }

    static Node mergeK(Node[] lists) {
        Node result = null;
        for (Node list : lists) {
            result = merge(result, list);
        }
        return result;
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
        Node l1 = new Node(1);
        l1.next = new Node(4);
        l1.next.next = new Node(7);
        Node l2 = new Node(2);
        l2.next = new Node(5);
        l2.next.next = new Node(8);

        Node l3 = new Node(3);
        l3.next = new Node(6);
        l3.next.next = new Node(9);
        Node[] lists = {l1, l2, l3};
        System.out.println("Merged K Lists:");
        Node result = mergeK(lists);
        printList(result);
    }
}
