package org.example.module.fifthtasksolution;

public class BinaryTree {
    int val;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree (int val) {
        this.val = val;
    }

    public static int maxDepth(BinaryTree root) {
        if (root == null) {
            return 0;
        }
        int Left = maxDepth(root.left);
        int Right = maxDepth(root.right);
        return Math.max(Left, Right) + 1;
    }
}
