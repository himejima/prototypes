package tree;

import tree.TreeNode;

/**
 * Created by himejima on 2016/03/20.
 */
// TODO: 名前変更する
public class AddTreeNode {
    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.value = 20;
        insertNode(10, node);
        insertNode(30, node);
        insertNode(50, node);

        System.out.println(findValue(node, 50));
    }

    public static TreeNode createNewNode(int num)
    {
        TreeNode newNode = new TreeNode();
        newNode.left = null;
        newNode.right = null;
        newNode.value = num;

        return newNode;
    }

    public static void insertNode(int num, TreeNode node) {
        if (node.value == num) {
            return;
        }

        // System.out.println(node.value);
        // num < node
        if (node.value > num) {
            if (node.left != null) {
                insertNode(num, node.left);
            } else {
                node.left = createNewNode(num);
            }
        } else {
            // num >= node
            if (node.right != null) {
                insertNode(num, node.right);
            } else {
                node.right = createNewNode(num);
            }
        }
        return;
    }

    public static TreeNode findValue(TreeNode node, int val) {
        if (node.value > val) {
            if (node.left == null) {
                return null;
            }
            return findValue(node.left, val);
        }

        if (node.value < val) {
            if (node.right == null) {
                return null;
            }
            return findValue(node.right, val);
        }
        System.out.println(node.value);
        return node;
    }
}
