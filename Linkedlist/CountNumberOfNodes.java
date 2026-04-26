
class CountNumberOfNodes {

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

        int count(Node head) {
            int c = 0;
            Node temp = head;
            while (temp != null) {
                c++;
                temp = temp.next;
            }
            return c;
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

        list.traverse();
        int result = list.count(list.head);
        System.out.println(" Number of nodes:" + result);

    }
}
