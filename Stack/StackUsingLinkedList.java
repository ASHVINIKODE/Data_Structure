
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {

    Node head;
//push operation

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(data + " pushed into stack");
    }
//pop operation

    int pop() {
        if (head == null) {
            System.out.println("Stack underflow");
            return -1;
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }

    boolean isempty() {
        return head == null;
    }

    void display() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("top Element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        stack.display();
    }
}
