public class OddPositionElements {
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

        void printOddPos(Node head) {
            Node temp = head;
            int i = 1;
            while (temp != null) {
                if (i % 2 != 0) {
                    System.out.print(temp.data+" ");

                }
                temp = temp.next;
                i++;
            }
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
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);
        list.traverse();
        System.out.println();
        System.out.println("Odd Position element:");
        list.printOddPos(list.head);

    }
}
