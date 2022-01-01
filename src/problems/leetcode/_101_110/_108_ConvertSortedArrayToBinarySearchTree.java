package problems.leetcode._101_110;

import objects.TreeNode;

// https://www.youtube.com/watch?v=12omz-VAyRk
public class _108_ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
//        int[] nums = {-10,-3,0,5,9};
        int[] nums = {1,3};
        TreeNode sorted = constructTree(nums, 0, nums.length-1);
        System.out.println(sorted);
    }

    public static TreeNode constructTree(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = constructTree(nums, left, mid - 1);
        root.right = constructTree(nums, mid + 1, right);
        return root;
    }
}
