package chap4;

import tree.*;

/**
 * Created by himejima on 2016/03/21.
 */
public class Ex1 {
    public static int all_count = 1;
    public static int height = 1;
    public static int max_height = 0;

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

        insertTreeNode(node, 11);
        insertTreeNode(node, 9);

        System.out.println(checkEquilibrium(node));
        System.out.println(all_count);
        System.out.println(max_height);
    }

    public static TreeNode createTreeNode(int n) {
        TreeNode node = new TreeNode();
        node.left = null;
        node.right = null;
        node.value = n;
        node.height = height;
        node.isPart = true;

        if (max_height < height) {
            max_height = height;
        }

        height = 1;
        all_count++;

        return node;
    }
    public static void insertTreeNode(TreeNode node, int n) {
        if (node.value == n) {
            node.height = 0;
            return;
        }

        if (node.value > n) {
            if (node.left != null) {
                insertTreeNode(node.left, n);
                node.left.isPart = false;
                height++;
            } else {
                node.left = createTreeNode(n);
            }
        } else {
            if (node.right != null) {
                insertTreeNode(node.right, n);
                node.right.isPart = false;
                height++;
            } else {
                node.right = createTreeNode(n);
            }
        }

        return;
    }

    static boolean result = true;
    public static boolean checkEquilibrium(TreeNode node) {
        if (node.left != null) {
            checkEquilibrium(node.left);
        }
        if (node.right != null) {
            // System.out.println(node.isPart);
            checkEquilibrium(node.right);
        }

        if (node.left == null && node.right == null) {
            if (node.height < max_height - 1) {
                result = false;
            }
            // System.out.println(node.isPart);
        }
        return result;
    }
}
