package com.anuragkapur.ds.tree;

/**
 * @author anuragkapur
 */
public class BSTMinAndMax {

    public TreeNode getMin(TreeNode node) {

        if (node.getLeft() != null) {
            return getMin(node.getLeft());
        }

        return node;
    }

    public TreeNode getMax(TreeNode node) {

        if (node.getRight() != null) {
            return getMax(node.getRight());
        }

        return node;
    }
}
