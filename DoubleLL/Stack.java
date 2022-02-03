package DoubleLL;

public class Stack {
    
    static Node top;

    private static void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            printStack();
            return;
        }
        top.prev = newNode;
        newNode.next = top;
        top = newNode;
        printStack();
    }

    private static void pop(){
        if(top == null){
            System.out.println("Stack underflow!");
            return;
        }
        top = top.next;
        printStack();
    }

    private static int peek(){
        if(top == null){
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }

    private static void printStack(){
        System.out.println();
        if (top == null) {
            System.out.println("Stack underflow!");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String args[]){
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

        System.out.println();

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

        System.out.println();
        System.out.println("Top is currently at : " + peek());
    }
}
