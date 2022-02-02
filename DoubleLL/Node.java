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
}