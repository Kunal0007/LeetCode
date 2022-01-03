package com.company.LeetCode;

import com.company.DSA__JAVA.BinaryTree.BinaryTree;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/

public class MaximumDepth_BT {

    class Node {
        int value;
        Node left, right;

        public Node(){
            this.value = 0;
            this.left = this.right = null;
        }

        public Node(int value){
            this.value = value;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
    }

    public int maxDepth(Node root) {
        if (root == null){
            return 0;
        }
        else {
            int lheight = maxDepth(root.left);
            int rheight = maxDepth(root.right);

            return 1 + Math.max(lheight, rheight);
        }
    }
}
