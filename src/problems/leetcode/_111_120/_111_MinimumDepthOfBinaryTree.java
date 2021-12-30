package problems.leetcode._111_120;

import objects.TreeNode;

public class _111_MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode root = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
        int maxDepth = minDepth(root);
        System.out.println(maxDepth);
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int ldepth = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
        int rdepth = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;

        return Math.min(ldepth, rdepth) + 1;
    }
}
