package chap4;

import tree.*;

/**
 * Created by himejima on 2016/03/21.
 */
public class Ex1 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.value = 47;
        insertTreeNode(node, 23);
        insertTreeNode(node, 61);
        insertTreeNode(node, 17);
        insertTreeNode(node, 35);
        insertTreeNode(node, 53);
        insertTreeNode(node, 72);
        insertTreeNode(node, 15);
        insertTreeNode(node, 20);
        insertTreeNode(node, 31);

    }

    public static TreeNode createTreeNode(int n) {
        TreeNode node = new TreeNode();
        node.left = null;
        node.right = null;
        node.value = n;

        return node;
    }
    public static void insertTreeNode(TreeNode node, int n) {
        if (node.value == n) {
            return;
        }

        if (node.value > n) {
            if (node.left != null) {
                insertTreeNode(node.left, n);
            } else {
                node.left = createTreeNode(n);
            }
        } else {
            if (node.right != null) {
                insertTreeNode(node.right, n);
            } else {
                node.right = createTreeNode(n);
            }
        }

        return;
    }
}
