package LinkedList;

public class Stack {

    static Node top = null;

    // will be inserted at the beginning of top
    // 0 -> NULL
    // 1 -> 0 -> NULL
    // 2 -> 1 -> 0 -> NULL
    private static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        printStack();
    }

    // will be popped from the beginning
    // 2 -> 1 -> 0 -> NULL
    // 1 -> 0 -> NULL
    private static void pop() {
        if(top == null){
            System.out.println("Stack underflow!");
            return;
        }
        top = top.next;
        printStack();
    }

    private static void printStack() {
        System.out.println();
        if (top == null) {
            System.out.println("Stack is empty!");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("NULL");
        }
    }

    public static void main(String args[]) {
        push(0);
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);
        push(7);
        push(8);
        push(9);
        push(10);
        push(11);

        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
    }
}
