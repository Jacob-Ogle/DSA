package org.bitsmith;

public class TreeNode<T> {

    T val;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T val) {
        this.val = val;
    }

    public TreeNode(T val, TreeNode<T> left, TreeNode<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public T getVal() {
        return this.val;
    }

    public T setVal(T val) {
        this.val = val;
        return this.val;
    }

}
