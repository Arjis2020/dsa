package DoubleLL;

public class Deletions extends Node {

    Deletions(int data) {
        super(data);
    }

    static Node root;

    // Helper to add data
    private static void add(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            printList(root);
            return;
        }
        Node temp = root;
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode;
        printList(root);
    }

    private static void deleteEnd() {
        if (root == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = root;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        printList(root);
    }

    private static void deleteBegin() {
        if (root == null) {
            System.out.println("List is empty!");
            return;
        }
        root = root.next;
        printList(root);
    }

    private static void deleteAt(int index) {
        if (root == null) {
            System.out.println("List is empty!");
            return;
        }
        if(index == 0){
            deleteBegin();
            return;
        }
        int counter = 0;
        Node temp = root;
        while (temp.next != null && counter < index) {
            temp = temp.next;
            counter++;
        }
        temp.prev.next = temp.next;
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
        printList(root);
    }

    public static void main(String args[]) {
        deleteEnd();
        deleteBegin();

        add(0);
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);

        System.out.println();

        deleteEnd();
        System.out.println();
        deleteBegin();
        System.out.println();
        deleteAt(0);
        System.out.println();
        deleteAt(100);
        System.out.println();
        deleteAt(2);
        System.out.println();
    }
}
