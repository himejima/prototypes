package chap3;

import chap2.Node;

/**
 * Created by himejima on 2016/03/19.
 */
public class Queue {
    Node first, last;

    void enqueue(Integer item) {
        if (first == null) {
            last = new Node(item);
            first = last;
        } else {
            last.next = new Node(item);
            last = last.next;
        }
    }

    Node dequeue() {
        if (first != null) {
            Integer item = first.data;
            first = first.next;
            return first;
        }
        return null;
    }
}
