package com.roy.medium;

import java.util.Stack;

/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
 */
class Solution98 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        inOrderTraversal(root);

    }

    public boolean isValidBST(TreeNode root) {
        return true;
    }

    public static void inOrderTraversal(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currNode = root;
        while (!stack.empty() || currNode != null) {
            if (currNode != null) {
                stack.push(currNode);
                currNode = currNode.left;
            } else {
                currNode = stack.pop();
                System.out.print(currNode.val + " ");
                currNode = currNode.right;
            }
        }

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
// @lc code=end
