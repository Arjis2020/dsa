package SingleLL;

class Insertions {

    static Node root = null;

    private static void insertEnd(int data) {
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

    private static void insertBegin(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = root;
            root = newNode;
        }
        printList();
    }

    private static void insertAt(int data, int index){
        if(root == null){
            root = new Node(data);
        }
        else{
            int counter = 0;
            Node temp = root;
            while(temp.next != null && counter < index - 1){
                temp = temp.next;
                counter++;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
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
        insertEnd(20);
        insertEnd(21);
        insertEnd(12);
        insertEnd(6);

        insertBegin(0);
        insertBegin(10);
        insertBegin(89);
        insertBegin(36);

        insertAt(40, 5);
        insertAt(31, 2);
        insertAt(13, 13);
        insertAt(266, 130);
    }
}
