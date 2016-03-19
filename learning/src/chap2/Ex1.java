package chap2;

import chap2.Node;
/**
 * Created by himejima on 2016/03/18.
 */
public class Ex1 {
    public static void main(String[] args) {
        // ソートされていない連結リストから重複する要素を削除する

        Node n = new Node(10);
        n.appendToTail(9);
        n.appendToTail(30);
        n.appendToTail(30);
        n.appendToTail(9);
        n.appendToTail(3);
        n.appendToTail(30);

        Node head = n.deleteDuplicate(n);
    }
}
