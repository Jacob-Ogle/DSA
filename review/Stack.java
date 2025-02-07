package org.bitsmith;

import java.util.Optional;

public class Stack<T> {
    Node<T> top;

    Stack() {
        this.top = null;
    }

    // Initialize Stack
    Stack(T val) {
        this.top = new Node<>(val);
    }

    // Push to Stack
    public void push(T val) {
        this.top = new Node<>(this.top, val);
    }

    public Optional<T> pop() {

        if (this.top == null) {
            return Optional.empty();
        }

        var val = this.top.data;
        this.top = this.top.prev;
        this.top.next = null;

        return Optional.ofNullable(val);
    }


    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top.data +
                '}';
    }
}
