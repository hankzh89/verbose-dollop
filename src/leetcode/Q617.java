package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Q617 {
    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /*public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode result = new TreeNode(0);
        TreeNode current = result;
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.add(t1);
        Queue<TreeNode> q2 = new LinkedList<>();
        q2.add(t2);
        while (q2.size() != 0) {
            TreeNode node1 = q1.remove();
            TreeNode node2 = q2.remove();
            current.val = node1.val + node2.val;
            if (node1.left != null) {

            }
        }
    }*/
}
