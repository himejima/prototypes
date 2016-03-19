package chap2;

import chap2.Node;
/**
 * Created by himejima on 2016/03/18.
 */
public class Main {
    public static void main(String[] args) {
        Node n = new Node(10);
        n.appendToTail(20);
        n.appendToTail(30);

        n.deleteNode(n, 20);
    }
}
