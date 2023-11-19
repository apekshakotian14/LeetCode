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
        flattenTree(root);
    }

    private TreeNode flattenTree(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode leftLast = flattenTree(node.left);
        TreeNode rightLast = flattenTree(node.right);
        TreeNode tempRight = node.right;
        if (leftLast != null) {
            node.right = node.left;
            node.left = null;
            leftLast.right = tempRight;
        }

        if (rightLast != null) {
            return rightLast;
        } else if (leftLast != null) {
            return leftLast;
        } else {
            return node;
        }
    }
}
