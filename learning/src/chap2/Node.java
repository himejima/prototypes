package chap2;

import java.util.HashMap;
import java.util.Map;

class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    // Ex1
    Node deleteDuplicate(Node head) {
        Node n = head;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Integer tmp;
        while (n.next != null) {
            tmp = map.get(n.data);
            if (tmp == null) {
                tmp = 0;
            }
            map.put(n.data, tmp + 1);

            n = n.next;
        }
        // 末尾の処理
        tmp = map.get(n.data);
        if (tmp == null) {
            tmp = 0;
        }
        map.put(n.data, tmp + 1);

        n = head;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            // System.out.println(e.getKey());
            // System.out.println(e.getValue());
            if (e.getValue() > 1) {
                for (int i = 0; i < e.getValue(); i++) {
                    // System.out.println(i);
                    n = deleteNode(n, e.getKey());
                }
            }
        }

        return n;
    }
}


