package com.oleynik.interviewtraining.lesson4.homework.bstree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeUtil {
    static TreeNode insert(TreeNode root, int key) {

        // If the tree is empty, return a new node
        if (root == null)
            return new TreeNode(key);

        // If the key is already present in the tree,
        // return the node
        if (root.key == key)
            return root;

        // Otherwise, recur down the tree
        if (key < root.key)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        // Return the (unchanged) node pointer
        return root;
    }

    // A utility function to do inorder tree traversal
    static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // Method to display the BST
    static void displayTree(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            while (levelSize > 0) {
                TreeNode node = queue.poll();
                System.out.print(node.key + " ");
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                levelSize--;
            }
            System.out.println();
        }
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        TreeNode root = null;

        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);
        root = insert(root, 100);
        root = insert(root, 15);
        root = insert(root, 25);
        root = insert(root, 91);

        // Print inorder traversal of the BST
        inorder(root);

        System.out.println();

        // Display the BST
        displayTree(root);
    }
}
