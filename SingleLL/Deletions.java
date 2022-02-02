package SingleLL;

public class Deletions {

    static Node root = null;

    // Just a helper
    // to insert data
    private static void add(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Node temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            temp.next = newNode;
        }
        printList();
    }

    private static void deleteEnd() {
        if (root == null) {
            System.out.println("Linked list is empty!");
            return;
        } else if (root.next == null) {
            Node newRoot = root.next;
            root = newRoot;
        } else {
            Node temp = root;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        printList();
    }

    private static void deleteBegin() {
        if (root == null) {
            System.out.println("Linked list is empty!");
            return;
        } else {
            Node newRoot = root.next;
            root = newRoot;
        }
        printList();
    }

    private static void deleteAt(int index) {
        if (root == null) {
            System.out.println("Linked list is empty!");
            return;
        } else if (root.next == null) {
            Node newRoot = root.next;
            root = newRoot;
        } else {
            int counter = 0;
            Node temp = root;
            while (temp.next.next != null && counter < index - 1) {
                temp = temp.next;
                counter++;
            }
            temp.next = temp.next != null ? temp.next.next : null;
        }
        printList();
    }

    private static void printList() {
        System.out.println();
        if (root == null) {
            System.out.println("List is empty!");
        } else {
            Node temp = root;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("NULL");
        }
    }

    public static void main(String args[]) {
        add(5);
        add(80);
        add(42);
        add(2);
        add(16);
        add(100);

        deleteEnd();
        deleteBegin();

        deleteAt(5);
        deleteAt(10);
        deleteAt(20);
        deleteAt(0);
    }
}
