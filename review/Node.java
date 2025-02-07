package org.bitsmith;
//
// Usages: Linked List, Linked List based stack
//
public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node(T data, Node<T> prev, Node<T> next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    // WTF
    public Node(Node<T> prev, T data) {
        this.data = data;
        this.prev = prev;
    }


    public Node<T> getPrev() {
        return this.prev;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getNodeData() {
        return this.data;
    }

}
