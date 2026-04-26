
import java.util.Scanner;

public class SearchElement {

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

        boolean find(Node head, int key) {
            Node temp = head;

            while (temp != null) {
                if (temp.data == key) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
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
        list.head = new Node(5);
        list.head.next = new Node(10);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(20);
        list.traverse();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the element you want to search:");
        int key = sc.nextInt();
        boolean result = list.find(list.head, key);
        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

    }
}
