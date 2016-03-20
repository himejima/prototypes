package chap3;

import chap2.Node;

/**
 * Created by himejima on 2016/03/19.
 */
public class Stack {
    Node top;

    Object pop() {
        if (top != null) {
            Integer item = top.data;
            top = top.next;
            return top;
        }
        return null;
    }

    void push(Integer item) {
        Node t = new Node(item);
        t.next = top;
        top = t;
    }

    Object peek() {
        return top.data;
    }
}
