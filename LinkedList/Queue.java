package LinkedList;

public class Queue {

    static Node front;
    static Node rear;

    private static void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            rear = front = newNode;
            printQueue();
            return;
        }
        rear.next = newNode;
        rear = newNode;
        printQueue();
    }

    private static void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if (front == null)
            rear = null;
        printQueue();
    }

    private static void printQueue() {
        System.out.println();
        if (front == null) {
            System.out.println("Queue is empty!");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("NULL");
        }
    }

    public static void main(String args[]) {
        dequeue();

        enqueue(0);
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        enqueue(6);
        enqueue(7);
        enqueue(8);
        enqueue(9);
        enqueue(10);

        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
    }
}
