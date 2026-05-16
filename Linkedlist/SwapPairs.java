public class SwapPairs {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node swapPairs(Node head){
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        while(prev.next!=null && prev.next.next!=null){
            Node first=prev.next;
            Node second=prev.next.next;
            first.next=second.next;
            second.next=first;
            prev.next=second;
            prev=first;
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

        head = swapPairs(head);

        System.out.println("After Swapping Pairs:");
        printList(head);
    }
}

