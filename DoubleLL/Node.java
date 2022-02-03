package DoubleLL;

// Util class for creating double linked list nodes
public class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }

    static void printList(Node root) {
        System.out.println();
        if (root == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
}
