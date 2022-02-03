package DoubleLL;

public class Basics {

    static Node root;

    private static void add(int data) {
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
        newNode.prev = temp;
        temp.next = newNode;
        printList();
    }

    private static boolean find(int data) {
        if (root == null) {
            System.out.println("List is empty!");
            return false;
        }
        Node temp = root;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
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
        add(0);
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);
        add(8);
        add(9);
        add(10);

        System.out.println();
        System.out.println("Finding : 5, Result : " + find(5));
        System.out.println("Finding : 80, Result : " + find(80));
        System.out.println("Finding : 8, Result : " + find(8));
        System.out.println("Finding : 12, Result : " + find(12));
    }
}
