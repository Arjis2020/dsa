package LinkedList;

class LinkedList {

    static Node root = null;

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
        System.out.println();
        printList();
    }

    private static void printList() {
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

    private static boolean find(int data) {
        if (root != null) {
            Node temp = root;
            while (temp != null) {
                if (temp.data == data) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        add(0);
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);

        System.out.println("Finding : 2, Result : " + find(2));
        System.out.println("Finding : 20, Result : " + find(20));
        System.out.println("Finding : 10, Result : " + find(10));
        System.out.println("Finding : 6, Result : " + find(6));
        System.out.println("Finding : 0, Result : " + find(0));
    }
}