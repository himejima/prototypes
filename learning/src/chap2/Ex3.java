package chap2;

import chap2.Node;
/**
 * Created by himejima on 2016/03/19.
 */
public class Ex3 {
    public static void main(String[] args) {
        // a -> b -> c -> d -> e
        // 奇数個であるという前提
        Node n = new Node(10);
        n.appendToTail(5);
        n.appendToTail(30);
        n.appendToTail(20);
        n.appendToTail(150);

        Node d = deleteMiddle(n);
    }

    public static Node deleteMiddle(Node head) {
        Node p1 = head;
        Node p2 = head;

        while (true) {
            p1 = p1.next.next;
            if (p1.next == null) {
                p2.next = p2.next.next;
                break;
            }
            p2 = p2.next;
        }
        return head;
    }
}
