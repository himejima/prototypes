package chap2;

import chap2.Node;

/**
 * Created by himejima on 2016/03/19.
 */
public class Ex2 {
    public static void main(String[] args) {
        Node n = new Node(10);
        n.appendToTail(20);
        n.appendToTail(30);
        n.appendToTail(40);

        Integer result = getDataFromTail(n, 2);
        System.out.println(result);
    }

    public static Integer getDataFromTail(Node head, Integer index) {
        Node n = head;
        Integer count = 0;
        while (true) {
            count++;
            if (n.next == null) {
                break;
            }
            n = n.next;
        }

        n = head;
        Integer tmp = 0;
        Integer target_index = count - index + 1;
        while (true) {
            tmp++;

            if (target_index == tmp) {
                return n.data;
            }

            if (n.next == null) {
                break;
            }
            n = n.next;
        }

        // TODO: 見つからなかった時の処理書く 例外処理
        return 0;
    }
}
