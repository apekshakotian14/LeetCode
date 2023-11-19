/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        flattentree(root);
    }

    private TreeNode flattentree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftchild = flattentree(root.left);
        TreeNode rightchild = flattentree(root.right);
        TreeNode temp = root.right;
        if (leftchild != null) {
            root.right = root.left;
            root.left = null;
            leftchild.right = temp;
        }

        if (rightchild != null) {
            return rightchild;
        } else if (leftchild != null) {
            return leftchild;
        } else {
            return root;
        }
    }
}
