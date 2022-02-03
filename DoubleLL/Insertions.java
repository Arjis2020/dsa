package DoubleLL;

public class Insertions {

    static Node root;

    private static void insertEnd(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            printList();
            return;
        }
        Node temp = root;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        printList();
    }

    private static void insertBegin(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            printList();
            return;
        }
        root.prev = newNode;
        newNode.next = root;
        root = newNode;
        printList();
    }

    private static void insertAt(int data, int index) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            printList();
            return;
        }
        int counter = 0;
        Node temp = root;
        while (temp.next != null && counter < index) {
            temp = temp.next;
            counter++;
        }
        Node next = temp.next;
        newNode.next = temp.next;
        newNode.prev = temp;
        if (next != null)
            temp.next.prev = newNode;
        temp.next = newNode;
        printList();
    }

    private static void printList() {
        System.out.println();
        if (root == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String args[]) {
        insertEnd(0);
        insertEnd(1);
        insertEnd(10);
        insertEnd(100);
        insertEnd(50);
        System.out.println();

        insertBegin(60);
        insertBegin(59);
        insertBegin(32);
        System.out.println();

        insertAt(32, 5);
        insertAt(64, 10);
        insertAt(13, 13);
        insertAt(96, 1);
    }
}
